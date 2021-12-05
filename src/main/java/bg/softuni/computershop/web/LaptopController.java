package bg.softuni.computershop.web;

import bg.softuni.computershop.models.binding.LaptopBindingModel;
import bg.softuni.computershop.models.binding.UserRegisterBindingModel;
import bg.softuni.computershop.models.service.LaptopServiceModel;
import bg.softuni.computershop.models.view.LaptopViewModel;
import bg.softuni.computershop.service.LaptopService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.io.IOException;
import java.security.Principal;
import java.util.List;

@Controller
public class LaptopController {

    private final ModelMapper modelMapper;
    private final LaptopService laptopService;

    public LaptopController(ModelMapper modelMapper, LaptopService laptopService) {
        this.modelMapper = modelMapper;
        this.laptopService = laptopService;
    }

    @ModelAttribute("laptopBindingModel")
    public LaptopBindingModel laptopBindingModel() {
        return new LaptopBindingModel();
    }

    @GetMapping("/laptops")
    public String allLaptops(Model model) {

        List<LaptopViewModel> laptops = laptopService.getAll();

        model.addAttribute("laptops", laptops);
        return "laptops";
    }

    @GetMapping("/add/laptop")
    public String addLaptop() {
        return "add-laptop";
    }

    @GetMapping("/laptop/{id}/details")
    public String showLaptopDetails(@PathVariable Long id,
                                    Model model) {

        model.addAttribute("laptop", laptopService.getLaptopById(id));

        return "laptopDetails";
    }

    @GetMapping("/buy/{id}/laptop")
    public String buyLaptop(@PathVariable Long id,
                            Principal principal) {

        laptopService.buyLaptop(id, principal.getName());

        return "redirect:/profile";
    }

    @PostMapping("/add/laptop")
    public String addLaptopForm(@Valid LaptopBindingModel laptopBindingModel,
                            BindingResult bindingResult,
                            RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()){
            redirectAttributes.addFlashAttribute("laptopBindingModel", laptopBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.laptopBindingModel",
                    bindingResult);

            return "redirect:/add/laptop";
        }

        try {
            laptopService.addLaptop(modelMapper.map(laptopBindingModel, LaptopServiceModel.class));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "redirect:/";
    }

    @DeleteMapping("/delete/{id}/laptop")
    public String deleteLaptop(@PathVariable Long id) {

        laptopService.deleteLaptop(id);

        return "redirect:/laptops";
    }
}
