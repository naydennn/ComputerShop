package bg.softuni.computershop.service;

import bg.softuni.computershop.models.entity.UserEntity;
import bg.softuni.computershop.models.service.UserRegisterServiceModel;
import bg.softuni.computershop.models.view.UserViewModel;

public interface UserService {

    void registerUser(UserRegisterServiceModel userRegisterServiceModel);

    UserEntity findByUsername(String username);

    UserViewModel getUserByUsername(String username);
}
