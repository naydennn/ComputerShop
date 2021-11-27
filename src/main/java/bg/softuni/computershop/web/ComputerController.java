package bg.softuni.computershop.web;

import bg.softuni.computershop.models.binding.ComputerBindingModel;
import bg.softuni.computershop.models.service.ComputerServiceModel;
import bg.softuni.computershop.service.ComputerService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.io.IOException;

@Controller
public class ComputerController {

    private final ModelMapper modelMapper;
    private final ComputerService computerService;

    public ComputerController(ModelMapper modelMapper, ComputerService computerService) {
        this.modelMapper = modelMapper;
        this.computerService = computerService;
    }

    @GetMapping("/computers")
    public String allComputers() {
        return "computers";
    }

    @GetMapping("/add/computer")
    public String addComputer() {
        return "add-computer";
    }

    @PostMapping("/add/computer")
    public String addComputerForm(@Valid ComputerBindingModel computerBindingModel,
                                  BindingResult bindingResult,
                                  RedirectAttributes redirectAttributes) throws IOException {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("computerAddBindingModel", computerBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.computerAddBindingModel",
                    bindingResult);

            return "redirect:/add/computer";
        }

        computerService.addComputer(modelMapper.map(computerBindingModel, ComputerServiceModel.class));


        return "redirect:/";
    }
}
