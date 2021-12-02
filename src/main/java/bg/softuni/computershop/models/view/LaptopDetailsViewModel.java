package bg.softuni.computershop.models.view;

import bg.softuni.computershop.models.entity.*;
import bg.softuni.computershop.models.enums.DeviceTypeEnum;

import java.time.LocalDate;

public class LaptopDetailsViewModel {

    private String model;
    private ProcessorEntity processor;
    private VideoCardEntity videoCard;
    private RamEntity ramEntity;
    private Double price;
    private String hardDisk;
    private String display;
    private String color;
    private String description;
    private LocalDate created;
    private DeviceTypeEnum type;
    private UserEntity user;
    private PictureEntity picture;

    public LaptopDetailsViewModel() {
    }

    public String getModel() {
        return model;
    }

    public LaptopDetailsViewModel setModel(String model) {
        this.model = model;
        return this;
    }

    public ProcessorEntity getProcessor() {
        return processor;
    }

    public LaptopDetailsViewModel setProcessor(ProcessorEntity processor) {
        this.processor = processor;
        return this;
    }

    public VideoCardEntity getVideoCard() {
        return videoCard;
    }

    public LaptopDetailsViewModel setVideoCard(VideoCardEntity videoCard) {
        this.videoCard = videoCard;
        return this;
    }

    public RamEntity getRamEntity() {
        return ramEntity;
    }

    public LaptopDetailsViewModel setRamEntity(RamEntity ramEntity) {
        this.ramEntity = ramEntity;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public LaptopDetailsViewModel setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public LaptopDetailsViewModel setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }

    public String getDisplay() {
        return display;
    }

    public LaptopDetailsViewModel setDisplay(String display) {
        this.display = display;
        return this;
    }

    public String getColor() {
        return color;
    }

    public LaptopDetailsViewModel setColor(String color) {
        this.color = color;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public LaptopDetailsViewModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LaptopDetailsViewModel setCreated(LocalDate created) {
        this.created = created;
        return this;
    }

    public DeviceTypeEnum getType() {
        return type;
    }

    public LaptopDetailsViewModel setType(DeviceTypeEnum type) {
        this.type = type;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public LaptopDetailsViewModel setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public PictureEntity getPicture() {
        return picture;
    }

    public LaptopDetailsViewModel setPicture(PictureEntity picture) {
        this.picture = picture;
        return this;
    }
}
