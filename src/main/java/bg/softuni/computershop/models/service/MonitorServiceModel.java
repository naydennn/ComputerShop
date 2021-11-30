package bg.softuni.computershop.models.service;

import bg.softuni.computershop.models.entity.UserEntity;
import bg.softuni.computershop.models.enums.ConnectionTypeEnum;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.util.List;

public class MonitorServiceModel {

    private String model;
    private String screen;
    private Double size;
    private String color;
    private List<ConnectionTypeEnum> connections;
    private Double price;
    private String description;
    private LocalDate created;
    private UserEntity user;
    private MultipartFile picture;

    public MonitorServiceModel() {
    }

    public String getModel() {
        return model;
    }

    public MonitorServiceModel setModel(String model) {
        this.model = model;
        return this;
    }

    public String getScreen() {
        return screen;
    }

    public MonitorServiceModel setScreen(String screen) {
        this.screen = screen;
        return this;
    }

    public Double getSize() {
        return size;
    }

    public MonitorServiceModel setSize(Double size) {
        this.size = size;
        return this;
    }

    public List<ConnectionTypeEnum> getConnections() {
        return connections;
    }

    public MonitorServiceModel setConnections(List<ConnectionTypeEnum> connections) {
        this.connections = connections;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public MonitorServiceModel setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public MonitorServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getCreated() {
        return created;
    }

    public MonitorServiceModel setCreated(LocalDate created) {
        this.created = created;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public MonitorServiceModel setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public MultipartFile getPicture() {
        return picture;
    }

    public MonitorServiceModel setPicture(MultipartFile picture) {
        this.picture = picture;
        return this;
    }

    public String getColor() {
        return color;
    }

    public MonitorServiceModel setColor(String color) {
        this.color = color;
        return this;
    }
}
