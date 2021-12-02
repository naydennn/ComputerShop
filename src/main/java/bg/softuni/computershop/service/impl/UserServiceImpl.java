package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.entity.UserEntity;
import bg.softuni.computershop.models.entity.UserRoleEntity;
import bg.softuni.computershop.models.enums.UserRoleEnum;
import bg.softuni.computershop.models.service.UserRegisterServiceModel;
import bg.softuni.computershop.repository.UserRepository;
import bg.softuni.computershop.repository.UserRoleRepository;
import bg.softuni.computershop.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;

    public UserServiceImpl(UserRepository userRepository, UserRoleRepository userRoleRepository, PasswordEncoder passwordEncoder, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
        this.passwordEncoder = passwordEncoder;
        this.modelMapper = modelMapper;
    }

    @Override
    public void init(){
        initRoles();
    }

    @Override
    public void registerUser(UserRegisterServiceModel userRegisterServiceModel) {
        UserEntity user = modelMapper.map(userRegisterServiceModel, UserEntity.class);
        UserRoleEntity adminRole = userRoleRepository.findByRole(UserRoleEnum.ADMIN);
        UserRoleEntity userRole = userRoleRepository.findByRole(UserRoleEnum.USER);

        user.setRoles(Set.of(adminRole, userRole));
        user.setMoney(0.0);
        user.setPassword(passwordEncoder.encode(userRegisterServiceModel.getPassword()));

        userRepository.save(user);
    }

    @Override
    public UserEntity findByUsername(String username) {

        return userRepository.findByUsername(username).get();
    }

    private void initRoles() {
        if (userRoleRepository.count() == 0) {
            UserRoleEntity adminRole = new UserRoleEntity();
            adminRole.setRole(UserRoleEnum.ADMIN);

            UserRoleEntity userRole = new UserRoleEntity();
            userRole.setRole(UserRoleEnum.USER);

            userRoleRepository.saveAll(List.of(adminRole, userRole));
        }
    }
}
