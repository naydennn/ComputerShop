package bg.softuni.computershop.models.binding;

import bg.softuni.computershop.models.entity.UserEntity;
import bg.softuni.computershop.models.validator.PictureValidation;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class MonitorAddBindingModel {

    @NotNull
    @Size(min = 2, max = 50)
    private String model;
    @NotNull
    @Size(min = 2, max = 50)
    private String screen;
    @NotNull
    @Size(min = 2, max = 10)
    private String color;
    @NotNull
    @Positive
    private Double size;
    @Positive
    @NotNull
    private Double price;
    private String description;
    @PastOrPresent
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate created;
    private UserEntity user;
    @PictureValidation
    private MultipartFile picture;

    public MonitorAddBindingModel() {
    }

    public String getModel() {
        return model;
    }

    public MonitorAddBindingModel setModel(String model) {
        this.model = model;
        return this;
    }

    public String getScreen() {
        return screen;
    }

    public MonitorAddBindingModel setScreen(String screen) {
        this.screen = screen;
        return this;
    }

    public Double getSize() {
        return size;
    }

    public MonitorAddBindingModel setSize(Double size) {
        this.size = size;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public MonitorAddBindingModel setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public MonitorAddBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getCreated() {
        return created;
    }

    public MonitorAddBindingModel setCreated(LocalDate created) {
        this.created = created;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public MonitorAddBindingModel setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public MultipartFile getPicture() {
        return picture;
    }

    public MonitorAddBindingModel setPicture(MultipartFile picture) {
        this.picture = picture;
        return this;
    }

    public String getColor() {
        return color;
    }

    public MonitorAddBindingModel setColor(String color) {
        this.color = color;
        return this;
    }
}
