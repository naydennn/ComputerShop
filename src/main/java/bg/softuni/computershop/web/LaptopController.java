package bg.softuni.computershop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LaptopController {

    @GetMapping("/laptops")
    public String allLaptops() {
        return "laptops";
    }
}
