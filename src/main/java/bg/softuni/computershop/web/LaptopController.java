package bg.softuni.computershop.web;

import bg.softuni.computershop.models.binding.LaptopBindingModel;
import bg.softuni.computershop.models.binding.UserRegisterBindingModel;
import bg.softuni.computershop.models.service.LaptopServiceModel;
import bg.softuni.computershop.service.LaptopService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.io.IOException;

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
    public String allLaptops() {
        return "laptops";
    }

    @GetMapping("/add/laptop")
    public String addLaptop() {
        return "add-laptop";
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
}
