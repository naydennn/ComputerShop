package bg.softuni.computershop.models.binding;

import bg.softuni.computershop.models.entity.UserEntity;
import bg.softuni.computershop.models.enums.ConnectionTypeEnum;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.List;

public class MonitorAddBindingModel {

    @NotNull
    @Size(min = 2, max = 20)
    private String model;
    @NotNull
    @Size(min = 2, max = 10)
    private String screen;
    @NotNull
    @Size(min = 2, max = 10)
    private String color;
    @NotNull
    @Size(min = 2, max = 10)
    private String resolution;
    private List<ConnectionTypeEnum> connections;
    @Positive
    @NotNull
    private Double price;
    private String description;
    @PastOrPresent
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate created;
    private UserEntity user;
    @NotNull
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

    public String getResolution() {
        return resolution;
    }

    public MonitorAddBindingModel setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }

    public List<ConnectionTypeEnum> getConnections() {
        return connections;
    }

    public MonitorAddBindingModel setConnections(List<ConnectionTypeEnum> connections) {
        this.connections = connections;
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
