package bg.softuni.computershop.models.binding;

import bg.softuni.computershop.models.validator.PictureValidation;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;

public class UserRegisterBindingModel {

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private Double money;
    private String confirmPassword;
    private MultipartFile picture;

    @NotNull
    @Size(min = 2, max = 20)
    public String getUsername() {
        return username;
    }

    public UserRegisterBindingModel setUsername(String username) {
        this.username = username;
        return this;
    }

    @NotNull
    @Size(min = 1)
    public String getFirstName() {
        return firstName;
    }

    public UserRegisterBindingModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @NotNull
    @Size(min = 1)
    public String getLastName() {
        return lastName;
    }

    public UserRegisterBindingModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Email
    @NotEmpty
    public String getEmail() {
        return email;
    }

    public UserRegisterBindingModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserRegisterBindingModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @NotNull
    @Min(3)
    public String getPassword() {
        return password;
    }

    public UserRegisterBindingModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public Double getMoney() {
        return money;
    }

    public UserRegisterBindingModel setMoney(Double money) {
        this.money = money;
        return this;
    }

    @NotNull
    @Min(3)
    public String getConfirmPassword() {
        return confirmPassword;
    }

    public UserRegisterBindingModel setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
        return this;
    }

    @PictureValidation
    public MultipartFile getPicture() {
        return picture;
    }

    public UserRegisterBindingModel setPicture(MultipartFile picture) {
        this.picture = picture;
        return this;
    }
}
