package bg.softuni.computershop.models.service;

import org.springframework.web.multipart.MultipartFile;

public class UserRegisterServiceModel {

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private Double money;
    private MultipartFile picture;

    public UserRegisterServiceModel() {
    }

    public String getUsername() {
        return username;
    }

    public UserRegisterServiceModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserRegisterServiceModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserRegisterServiceModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserRegisterServiceModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserRegisterServiceModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserRegisterServiceModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public Double getMoney() {
        return money;
    }

    public UserRegisterServiceModel setMoney(Double money) {
        this.money = money;
        return this;
    }

    public MultipartFile getPicture() {
        return picture;
    }

    public UserRegisterServiceModel setPicture(MultipartFile picture) {
        this.picture = picture;
        return this;
    }
}
