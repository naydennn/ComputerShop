package bg.softuni.computershop.web;

import bg.softuni.computershop.models.binding.MonitorAddBindingModel;
import bg.softuni.computershop.models.binding.MonitorEditModel;
import bg.softuni.computershop.models.service.MonitorServiceModel;
import bg.softuni.computershop.models.view.MonitorViewModel;
import bg.softuni.computershop.service.MonitorService;
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
public class MonitorController {

    private final ModelMapper modelMapper;
    private final MonitorService monitorService;

    public MonitorController(ModelMapper modelMapper, MonitorService monitorService) {
        this.modelMapper = modelMapper;
        this.monitorService = monitorService;
    }

    @ModelAttribute("monitorAddBindingModel")
    public MonitorAddBindingModel monitorAddBindingModel() {
        return new MonitorAddBindingModel();
    }

    @GetMapping("/monitors")
    public String allMonitors(Model model) {
        List<MonitorViewModel> monitors = monitorService.getAllMonitors();

        model.addAttribute("monitors", monitors);
        return "monitors";
    }

    @GetMapping("/add/monitor")
    public String addMonitor() {

        return "add-monitor";
    }

    @GetMapping("/monitor/{id}/details")
    public String showMonitor(@PathVariable Long id,
                              Model model) {

        model.addAttribute("monitor", monitorService.getMonitorDetailById(id));

        return "monitorDetails";
    }

    @GetMapping("/buy/{id}/monitor")
    public String buyMonitor(@PathVariable Long id,
                             Principal principal) {

        monitorService.buyMonitor(id, principal.getName());

        return "redirect:/profile";
    }


    @GetMapping("/edit/{id}/monitor")
    public String edit(@PathVariable Long id, Model model) {

        MonitorViewModel monitorViewModel = monitorService.findById(id);

        model.addAttribute("monitorViewModel", monitorViewModel);
        return "edit-monitor";
    }

    @PatchMapping("/edit/{id}/monitor")
    public String editMonitor(@PathVariable Long id,
                              @Valid MonitorEditModel monitorEditModel,
                              BindingResult bindingResult,
                              RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("monitorEditModel", monitorEditModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.monitorEditModel", bindingResult);


               return "redirect:/edit/" + id + "/monitor";
        }

        monitorService.updateMonitor(id, monitorEditModel);
        return "redirect:/monitors";
    }


    @PostMapping("/add/monitor")
    public String addMonitorForm(@Valid MonitorAddBindingModel monitorAddBindingModel,
                                 BindingResult bindingResult,
                                 RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {

            redirectAttributes.addFlashAttribute("monitorAddBindingModel", monitorAddBindingModel);
            redirectAttributes.addFlashAttribute("org.springframework.validation.BindingResult.monitorAddBindingModel",
                    bindingResult);

            return "redirect:/add/monitor";
        }

        try {
            monitorService.addMonitor(modelMapper.map(monitorAddBindingModel, MonitorServiceModel.class));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }

    @DeleteMapping("/delete/{id}/monitor")
    public String deleteMonitor(@PathVariable Long id) {

        monitorService.deleteMonitor(id);

        return "redirect:/monitors";
    }

}
