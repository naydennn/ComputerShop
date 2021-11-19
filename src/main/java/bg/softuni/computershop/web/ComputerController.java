package bg.softuni.computershop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComputerController {

    @GetMapping("/computers")
    public String allComputers() {
        return "computers";
    }
}
