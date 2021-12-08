package bg.softuni.computershop.models.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String password;
    private Double money;
    private PictureEntity picture;
    private Set<UserRoleEntity> roles = new HashSet<>();
    private Set<LaptopEntity> laptops;
    private Set<ComputerEntity> computers;
    private Set<MonitorEntity> monitors;

    public UserEntity() {
    }


    @Column(nullable = false, unique = true)
    public String getUsername() {
        return username;
    }

    public UserEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    @Column(nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public UserEntity setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Column(nullable = false)
    public String getLastName() {
        return lastName;
    }

    public UserEntity setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Column(nullable = false)
    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public UserEntity setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }

    @Column(nullable = false)
    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    @ManyToMany(fetch = FetchType.EAGER)
    public Set<UserRoleEntity> getRoles() {
        return roles;
    }

    public UserEntity setRoles(Set<UserRoleEntity> roles) {
        this.roles = roles;
        return this;
    }

    public Double getMoney() {
        return money;
    }

    public UserEntity setMoney(Double money) {
        this.money = money;
        return this;
    }

    @ManyToMany(mappedBy = "users", fetch = FetchType.EAGER)
    public Set<LaptopEntity> getLaptops() {
        return laptops;
    }

    public UserEntity setLaptops(Set<LaptopEntity> laptops) {
        this.laptops = laptops;
        return this;
    }

    @ManyToMany(mappedBy = "users", fetch = FetchType.EAGER)
    public Set<ComputerEntity> getComputers() {
        return computers;
    }

    public UserEntity setComputers(Set<ComputerEntity> computers) {
        this.computers = computers;
        return this;
    }

    @ManyToMany(mappedBy = "users", fetch = FetchType.EAGER)
    public Set<MonitorEntity> getMonitors() {
        return monitors;
    }

    public UserEntity setMonitors(Set<MonitorEntity> monitors) {
        this.monitors = monitors;
        return this;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public PictureEntity getPicture() {
        return picture;
    }

    public UserEntity setPicture(PictureEntity picture) {
        this.picture = picture;
        return this;
    }
}
