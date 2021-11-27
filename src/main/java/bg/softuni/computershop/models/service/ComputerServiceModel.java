package bg.softuni.computershop.models.service;

import bg.softuni.computershop.models.enums.DeviceTypeEnum;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;

public class ComputerServiceModel {

    private String model;
    private String processorModel;
    private Integer processorCores;
    private Double processorFrequency;
    private String gpu;
    private Integer videoCardMemory;
    private String videoTypeOfMemory;
    private Double price;
    private String computerMemory;
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

    public String getProcessorModel() {
        return processorModel;
    }

    public ComputerServiceModel setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
        return this;
    }

    public Integer getProcessorCores() {
        return processorCores;
    }

    public ComputerServiceModel setProcessorCores(Integer processorCores) {
        this.processorCores = processorCores;
        return this;
    }

    public Double getProcessorFrequency() {
        return processorFrequency;
    }

    public ComputerServiceModel setProcessorFrequency(Double processorFrequency) {
        this.processorFrequency = processorFrequency;
        return this;
    }

    public String getGpu() {
        return gpu;
    }

    public ComputerServiceModel setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public Integer getVideoCardMemory() {
        return videoCardMemory;
    }

    public ComputerServiceModel setVideoCardMemory(Integer videoCardMemory) {
        this.videoCardMemory = videoCardMemory;
        return this;
    }

    public String getVideoTypeOfMemory() {
        return videoTypeOfMemory;
    }

    public ComputerServiceModel setVideoTypeOfMemory(String videoTypeOfMemory) {
        this.videoTypeOfMemory = videoTypeOfMemory;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public ComputerServiceModel setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getComputerMemory() {
        return computerMemory;
    }

    public ComputerServiceModel setComputerMemory(String computerMemory) {
        this.computerMemory = computerMemory;
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
}
