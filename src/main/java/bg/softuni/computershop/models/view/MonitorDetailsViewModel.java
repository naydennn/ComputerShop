package bg.softuni.computershop.models.view;

import bg.softuni.computershop.models.entity.PictureEntity;
import bg.softuni.computershop.models.entity.UserEntity;
import bg.softuni.computershop.models.enums.ConnectionTypeEnum;

import java.time.LocalDate;
import java.util.List;

public class MonitorDetailsViewModel {

    private String model;
    private String screen;
    private Double size;
    private String color;
    private List<ConnectionTypeEnum> connectionType;
    private Double price;
    private String description;
    private LocalDate created;
    private UserEntity user;
    private PictureEntity picture;

    public MonitorDetailsViewModel() {
    }

    public String getModel() {
        return model;
    }

    public MonitorDetailsViewModel setModel(String model) {
        this.model = model;
        return this;
    }

    public String getScreen() {
        return screen;
    }

    public MonitorDetailsViewModel setScreen(String screen) {
        this.screen = screen;
        return this;
    }

    public Double getSize() {
        return size;
    }

    public MonitorDetailsViewModel setSize(Double size) {
        this.size = size;
        return this;
    }

    public String getColor() {
        return color;
    }

    public MonitorDetailsViewModel setColor(String color) {
        this.color = color;
        return this;
    }

    public List<ConnectionTypeEnum> getConnectionType() {
        return connectionType;
    }

    public MonitorDetailsViewModel setConnectionType(List<ConnectionTypeEnum> connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public MonitorDetailsViewModel setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public MonitorDetailsViewModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getCreated() {
        return created;
    }

    public MonitorDetailsViewModel setCreated(LocalDate created) {
        this.created = created;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public MonitorDetailsViewModel setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public PictureEntity getPicture() {
        return picture;
    }

    public MonitorDetailsViewModel setPicture(PictureEntity picture) {
        this.picture = picture;
        return this;
    }
}
