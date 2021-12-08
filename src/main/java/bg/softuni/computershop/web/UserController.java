package bg.softuni.computershop.web;

import bg.softuni.computershop.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.constraints.Positive;
import java.security.Principal;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/profile")
    public String getProfile(Model model, Principal principal){

        model.addAttribute("user",userService.getUserByUsername(principal.getName()));
        return "profile";
    }

    @PostMapping("/add/money")
    public String addMoney(@RequestParam(value = "money") Double money,
                           Principal principal) {

        if (money >= 0) {
            userService.addMoney(money, principal.getName());
        }
        return "redirect:/profile";
    }
}
