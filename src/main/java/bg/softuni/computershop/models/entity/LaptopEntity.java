package bg.softuni.computershop.models.entity;

import bg.softuni.computershop.models.enums.DeviceTypeEnum;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "laptops")
public class LaptopEntity extends BaseEntity{

    private String model;
    private String processor;
    private Double price;
    private String videoCard;
    private String memory;
    private String hardDisk;
    private String display;
    private String color;
    private LocalDateTime create;
    private DeviceTypeEnum type;
    private UserEntity user;

    public LaptopEntity() {
    }

    public String getModel() {
        return model;
    }

    public LaptopEntity setModel(String model) {
        this.model = model;
        return this;
    }

    public String getProcessor() {
        return processor;
    }

    public LaptopEntity setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public LaptopEntity setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public LaptopEntity setVideoCard(String videoCard) {
        this.videoCard = videoCard;
        return this;
    }

    public String getMemory() {
        return memory;
    }

    public LaptopEntity setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public LaptopEntity setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }

    public String getDisplay() {
        return display;
    }

    public LaptopEntity setDisplay(String display) {
        this.display = display;
        return this;
    }

    public String getColor() {
        return color;
    }

    public LaptopEntity setColor(String color) {
        this.color = color;
        return this;
    }

    @Enumerated(EnumType.STRING)
    public DeviceTypeEnum getType() {
        return type;
    }

    public LaptopEntity setType(DeviceTypeEnum type) {
        this.type = type;
        return this;
    }

    @ManyToOne
    public UserEntity getUser() {
        return user;
    }

    public LaptopEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }

}