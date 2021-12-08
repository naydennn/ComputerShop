package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.entity.*;
import bg.softuni.computershop.models.enums.UserRoleEnum;
import bg.softuni.computershop.models.service.UserRegisterServiceModel;
import bg.softuni.computershop.models.view.UserViewModel;
import bg.softuni.computershop.repository.UserRepository;
import bg.softuni.computershop.repository.UserRoleRepository;
import bg.softuni.computershop.service.CloudinaryService;
import bg.softuni.computershop.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserRoleRepository userRoleRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;
    private final CloudinaryService cloudinaryService;

    public UserServiceImpl(UserRepository userRepository, UserRoleRepository userRoleRepository, PasswordEncoder passwordEncoder, ModelMapper modelMapper, CloudinaryService cloudinaryService) {
        this.userRepository = userRepository;
        this.userRoleRepository = userRoleRepository;
        this.passwordEncoder = passwordEncoder;
        this.modelMapper = modelMapper;
        this.cloudinaryService = cloudinaryService;
    }

    @Override
    public void registerUser(UserRegisterServiceModel userRegisterServiceModel) {
        UserEntity user = modelMapper.map(userRegisterServiceModel, UserEntity.class);
        UserRoleEntity userRole = userRoleRepository.findByRole(UserRoleEnum.USER);

        CloudinaryImage cloudinaryImage = null;
        try {
            cloudinaryImage = cloudinaryService.upload(userRegisterServiceModel.getPicture());
        } catch (IOException e) {
            e.printStackTrace();
        }
        user.setPicture(new PictureEntity().setPublicId(cloudinaryImage.getPublicId()).setUrl(cloudinaryImage.getUrl()));

        user.setRoles(Set.of(userRole));
        user.setMoney(0.0);
        user.setPassword(passwordEncoder.encode(userRegisterServiceModel.getPassword()));

        userRepository.save(user);
    }

    @Override
    public UserEntity findByUsername(String username) {

        return userRepository.findByUsername(username).get();
    }

    @Override
    public UserViewModel getUserByUsername(String username) {

        return modelMapper.map(userRepository.findByUsername(username).get(), UserViewModel.class);
    }

    @Override
    public boolean setMoney(UserEntity userEntity, Double price) {

        if (userEntity.getMoney() - price >= 0) {
            userEntity.setMoney(userEntity.getMoney() - price);

            userRepository.save(userEntity);
            return true;
        }

        return false;
    }

    @Override
    public void addMoney(Double money, String username) {
        UserEntity userEntity = userRepository.findByUsername(username).get();

        userEntity.setMoney(userEntity.getMoney() + money);

        userRepository.save(userEntity);
    }
}
