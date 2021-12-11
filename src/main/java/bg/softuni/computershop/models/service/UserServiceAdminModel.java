package bg.softuni.computershop.models.service;

public class UserServiceAdminModel {

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private Double money;

    public UserServiceAdminModel() {
    }

    public String getUsername() {
        return username;
    }

    public UserServiceAdminModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserServiceAdminModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserServiceAdminModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserServiceAdminModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserServiceAdminModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public Double getMoney() {
        return money;
    }

    public UserServiceAdminModel setMoney(Double money) {
        this.money = money;
        return this;
    }
}
