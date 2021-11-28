package bg.softuni.computershop.models.service;

import bg.softuni.computershop.models.entity.ProcessorEntity;
import bg.softuni.computershop.models.entity.RamEntity;
import bg.softuni.computershop.models.entity.UserEntity;
import bg.softuni.computershop.models.entity.VideoCardEntity;
import bg.softuni.computershop.models.enums.DeviceTypeEnum;
import org.springframework.web.multipart.MultipartFile;


import java.time.LocalDate;

public class LaptopServiceModel {

    private String model;
    private ProcessorEntity processor;
    private VideoCardEntity videoCard;
    private RamEntity ram;
    private Double price;
    private String hardDisk;
    private String display;
    private String color;
    private String description;
    private LocalDate created;
    private DeviceTypeEnum type;
    private UserEntity user;
    private MultipartFile picture;

    public LaptopServiceModel() {
    }

    public String getModel() {
        return model;
    }

    public LaptopServiceModel setModel(String model) {
        this.model = model;
        return this;
    }

    public ProcessorEntity getProcessor() {
        return processor;
    }

    public LaptopServiceModel setProcessor(ProcessorEntity processor) {
        this.processor = processor;
        return this;
    }

    public VideoCardEntity getVideoCard() {
        return videoCard;
    }

    public LaptopServiceModel setVideoCard(VideoCardEntity videoCard) {
        this.videoCard = videoCard;
        return this;
    }

    public RamEntity getRam() {
        return ram;
    }

    public LaptopServiceModel setRam(RamEntity ram) {
        this.ram = ram;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public LaptopServiceModel setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public LaptopServiceModel setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }

    public String getDisplay() {
        return display;
    }

    public LaptopServiceModel setDisplay(String display) {
        this.display = display;
        return this;
    }

    public String getColor() {
        return color;
    }

    public LaptopServiceModel setColor(String color) {
        this.color = color;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public LaptopServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LaptopServiceModel setCreated(LocalDate created) {
        this.created = created;
        return this;
    }

    public DeviceTypeEnum getType() {
        return type;
    }

    public LaptopServiceModel setType(DeviceTypeEnum type) {
        this.type = type;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public LaptopServiceModel setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public MultipartFile getPicture() {
        return picture;
    }

    public LaptopServiceModel setPicture(MultipartFile picture) {
        this.picture = picture;
        return this;
    }
}
