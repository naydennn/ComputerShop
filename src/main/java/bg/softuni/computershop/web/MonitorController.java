package bg.softuni.computershop.web;

import bg.softuni.computershop.models.binding.LaptopBindingModel;
import bg.softuni.computershop.models.binding.MonitorAddBindingModel;
import bg.softuni.computershop.models.enums.ConnectionTypeEnum;
import bg.softuni.computershop.models.service.MonitorServiceModel;
import bg.softuni.computershop.service.MonitorService;
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
    public String allMonitors() {
        return "monitors";
    }

    @GetMapping("/add/monitor")
    public String addMonitor(Model model) {
        List<ConnectionTypeEnum> connections = List.of(ConnectionTypeEnum.DVI,
                ConnectionTypeEnum.DISPLAY_PORT,
                ConnectionTypeEnum.USB,
                ConnectionTypeEnum.VGA,
                ConnectionTypeEnum.HDMI);

        model.addAttribute("connections", connections);
        return "add-monitor";
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
}
