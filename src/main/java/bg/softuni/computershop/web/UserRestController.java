package bg.softuni.computershop.web;

import bg.softuni.computershop.models.view.UserAdminView;
import bg.softuni.computershop.models.view.UserViewModel;
import bg.softuni.computershop.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserRestController {

    private final ModelMapper modelMapper;
    private final UserService userService;

    public UserRestController(ModelMapper modelMapper, UserService userService) {
        this.modelMapper = modelMapper;
        this.userService = userService;
    }

    @GetMapping("/users-info")
    public ResponseEntity<List<UserAdminView>> getAllUsers() {

        List<UserAdminView> users = userService.getAllUsers().stream()
                .map(user -> modelMapper.map(user, UserAdminView.class))
                .collect(Collectors.toList());

        return ResponseEntity.ok(users);
    }
}
