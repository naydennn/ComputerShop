package bg.softuni.computershop.models.view;

import bg.softuni.computershop.models.entity.*;
import bg.softuni.computershop.models.enums.DeviceTypeEnum;

import java.time.LocalDate;

public class ComputerDetailView {

    private Long id;
    private String model;
    private ProcessorEntity processor;
    private VideoCardEntity videoCard;
    private RamEntity ram;
    private Double price;
    private String storage;
    private String motherboard;
    private String powerSupply;
    private String description;
    private LocalDate created;
    private DeviceTypeEnum type;
    private PictureEntity picture;
    private UserEntity user;

    public ComputerDetailView() {
    }

    public String getModel() {
        return model;
    }

    public ComputerDetailView setModel(String model) {
        this.model = model;
        return this;
    }

    public ProcessorEntity getProcessor() {
        return processor;
    }

    public ComputerDetailView setProcessor(ProcessorEntity processor) {
        this.processor = processor;
        return this;
    }

    public VideoCardEntity getVideoCard() {
        return videoCard;
    }

    public ComputerDetailView setVideoCard(VideoCardEntity videoCard) {
        this.videoCard = videoCard;
        return this;
    }

    public RamEntity getRam() {
        return ram;
    }

    public ComputerDetailView setRam(RamEntity ram) {
        this.ram = ram;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public ComputerDetailView setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getStorage() {
        return storage;
    }

    public ComputerDetailView setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public ComputerDetailView setMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public ComputerDetailView setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ComputerDetailView setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getCreated() {
        return created;
    }

    public ComputerDetailView setCreated(LocalDate created) {
        this.created = created;
        return this;
    }

    public DeviceTypeEnum getType() {
        return type;
    }

    public ComputerDetailView setType(DeviceTypeEnum type) {
        this.type = type;
        return this;
    }

    public PictureEntity getPicture() {
        return picture;
    }

    public ComputerDetailView setPicture(PictureEntity picture) {
        this.picture = picture;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public ComputerDetailView setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public Long getId() {
        return id;
    }

    public ComputerDetailView setId(Long id) {
        this.id = id;
        return this;
    }
}
