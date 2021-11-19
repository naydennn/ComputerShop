package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.repository.UserRepository;
import bg.softuni.computershop.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
}
