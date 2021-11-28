package bg.softuni.computershop.web;

import bg.softuni.computershop.models.binding.ComputerBindingModel;
import bg.softuni.computershop.models.binding.LaptopBindingModel;
import bg.softuni.computershop.models.service.ComputerServiceModel;
import bg.softuni.computershop.models.view.ComputerViewModel;
import bg.softuni.computershop.service.ComputerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.io.IOException;
import java.util.List;

@Controller
public class ComputerController {

    private final ModelMapper modelMapper;
    private final ComputerService computerService;

    public ComputerController(ModelMapper modelMapper, ComputerService computerService) {
        this.modelMapper = modelMapper;
        this.computerService = computerService;
    }

    @ModelAttribute("computerBindingModel")
    public ComputerBindingModel computerBindingModel() {
        return new ComputerBindingModel();
    }

    @GetMapping("/computers")
    public String allComputers(Model model) {
        List<ComputerViewModel> computers = computerService.getAllComputers();
        model.addAttribute("computers" , computers);
        return "computers";
    }

    @GetMapping("/add/computer")
    public String addComputer() {
        return "add-computer";
    }


    @PostMapping("/add/computer")
    public String addComputerForm(@Valid ComputerBindingModel computerBindingModel,
                                  BindingResult bindingResult,
                                  RedirectAttributes redirectAttributes)  {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("computerBindingModel", computerBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.computerBindingModel",
                    bindingResult);

            return "redirect:/add/computer";
        }

        try {
            computerService.addComputer(modelMapper.map(computerBindingModel, ComputerServiceModel.class));
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "redirect:/";
    }
}
