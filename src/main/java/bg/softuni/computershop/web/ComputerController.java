package bg.softuni.computershop.web;

import bg.softuni.computershop.models.binding.ComputerBindingModel;
import bg.softuni.computershop.models.binding.ComputerEditModel;
import bg.softuni.computershop.models.binding.MonitorEditModel;
import bg.softuni.computershop.models.service.ComputerServiceModel;
import bg.softuni.computershop.models.view.ComputerDetailView;
import bg.softuni.computershop.models.view.ComputerViewModel;
import bg.softuni.computershop.models.view.MonitorViewModel;
import bg.softuni.computershop.service.ComputerService;
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
        model.addAttribute("computers", computers);
        return "computers";
    }

    @GetMapping("/add/computer")
    public String addComputer() {
        return "add-computer";
    }

    @GetMapping("/computer/{id}/details")
    public String showComputerDetail(@PathVariable Long id,
                                     Model model) {

        model.addAttribute("computer", computerService.getComputerDetailById(id));

        return "computerDetails";
    }

    @GetMapping("/buy/{id}/computer")
    public String buyComputer(@PathVariable Long id,
                              Principal principal) {
        computerService.buyComputer(id, principal.getName());
        return "redirect:/profile";
    }

    @GetMapping("/edit/{id}/computer")
    public String edit(@PathVariable Long id, Model model) {

        ComputerViewModel computerViewModel = computerService.findById(id);

        model.addAttribute("computerViewModel", computerViewModel);
        return "edit-computer";
    }

    @PatchMapping("/edit/{id}/computer")
    public String editMonitor(@PathVariable Long id,
                              @Valid ComputerEditModel computerEditModel,
                              BindingResult bindingResult,
                              RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("computerEditModel", computerEditModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.computerEditModel", bindingResult);


            return "redirect:/edit/" + id + "/computer";
        }

        computerService.updateMonitor(id, computerEditModel);
        return "redirect:/computers";
    }

    @PostMapping("/add/computer")
    public String addComputerForm(@Valid ComputerBindingModel computerBindingModel,
                                  BindingResult bindingResult,
                                  RedirectAttributes redirectAttributes) {

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

    @DeleteMapping("/delete/{id}/computer")
    public String deleteComputer(@PathVariable Long id) {

        computerService.deleteComputer(id);

        return "redirect:/computers";
    }
}
