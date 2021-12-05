package bg.softuni.computershop.models.view;

import bg.softuni.computershop.models.entity.ComputerEntity;
import bg.softuni.computershop.models.entity.LaptopEntity;
import bg.softuni.computershop.models.entity.MonitorEntity;
import bg.softuni.computershop.models.entity.UserRoleEntity;

import java.util.HashSet;
import java.util.Set;

public class UserViewModel {

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private Double money;
    private Set<UserRoleEntity> roles = new HashSet<>();
    private Set<LaptopEntity> laptops;
    private Set<ComputerEntity> computers;
    private Set<MonitorEntity> monitors;

    public UserViewModel() {
    }

    public String getUsername() {
        return username;
    }

    public UserViewModel setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserViewModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserViewModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserViewModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserViewModel setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserViewModel setPassword(String password) {
        this.password = password;
        return this;
    }

    public Double getMoney() {
        return money;
    }

    public UserViewModel setMoney(Double money) {
        this.money = money;
        return this;
    }

    public Set<UserRoleEntity> getRoles() {
        return roles;
    }

    public UserViewModel setRoles(Set<UserRoleEntity> roles) {
        this.roles = roles;
        return this;
    }

    public Set<LaptopEntity> getLaptops() {
        return laptops;
    }

    public UserViewModel setLaptops(Set<LaptopEntity> laptops) {
        this.laptops = laptops;
        return this;
    }

    public Set<ComputerEntity> getComputers() {
        return computers;
    }

    public UserViewModel setComputers(Set<ComputerEntity> computers) {
        this.computers = computers;
        return this;
    }

    public Set<MonitorEntity> getMonitors() {
        return monitors;
    }

    public UserViewModel setMonitors(Set<MonitorEntity> monitors) {
        this.monitors = monitors;
        return this;
    }
}
