package bg.softuni.computershop.models.service;

import bg.softuni.computershop.models.entity.ProcessorEntity;
import bg.softuni.computershop.models.entity.RamEntity;
import bg.softuni.computershop.models.entity.VideoCardEntity;
import bg.softuni.computershop.models.enums.DeviceTypeEnum;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

public class ComputerServiceModel {

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
    private MultipartFile picture;

    public ComputerServiceModel() {
    }

    public String getModel() {
        return model;
    }

    public ComputerServiceModel setModel(String model) {
        this.model = model;
        return this;
    }

    public ProcessorEntity getProcessor() {
        return processor;
    }

    public ComputerServiceModel setProcessor(ProcessorEntity processor) {
        this.processor = processor;
        return this;
    }

    public VideoCardEntity getVideoCard() {
        return videoCard;
    }

    public ComputerServiceModel setVideoCard(VideoCardEntity videoCard) {
        this.videoCard = videoCard;
        return this;
    }

    public RamEntity getRam() {
        return ram;
    }

    public ComputerServiceModel setRam(RamEntity ram) {
        this.ram = ram;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public ComputerServiceModel setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getStorage() {
        return storage;
    }

    public ComputerServiceModel setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public ComputerServiceModel setMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public ComputerServiceModel setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ComputerServiceModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getCreated() {
        return created;
    }

    public ComputerServiceModel setCreated(LocalDate created) {
        this.created = created;
        return this;
    }

    public DeviceTypeEnum getType() {
        return type;
    }

    public ComputerServiceModel setType(DeviceTypeEnum type) {
        this.type = type;
        return this;
    }

    public MultipartFile getPicture() {
        return picture;
    }

    public ComputerServiceModel setPicture(MultipartFile picture) {
        this.picture = picture;
        return this;
    }

    public Long getId() {
        return id;
    }

    public ComputerServiceModel setId(Long id) {
        this.id = id;
        return this;
    }
}
