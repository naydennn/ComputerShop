package bg.softuni.computershop.service;

import bg.softuni.computershop.models.entity.UserEntity;
import bg.softuni.computershop.models.service.UserRegisterServiceModel;

public interface UserService {

    void init();

    void registerUser(UserRegisterServiceModel userRegisterServiceModel);

    UserEntity findByUsername(String username);
}
