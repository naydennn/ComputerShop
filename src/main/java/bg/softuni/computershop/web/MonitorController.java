package bg.softuni.computershop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MonitorController {

    @GetMapping("/monitors")
    public String allMonitors() {
        return "monitors";
    }
}