package bg.softuni.computershop.models.binding;

import bg.softuni.computershop.models.enums.DeviceTypeEnum;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import java.time.LocalDate;

public class ComputerBindingModel {

    @NotNull
    private String model;
    @NotNull
    private String processorModel;
    @NotNull
    @Positive
    private Integer processorCores;
    @NotNull
    @Positive
    private Double processorFrequency;
    @NotNull
    private String gpu;
    @NotNull
    @Positive
    private Integer videoCardMemory;
    private String videoTypeOfMemory;
    @NotNull
    @Positive
    private Double price;
    @NotNull
    private String computerMemory;
    @NotNull
    private String storage;
    @NotNull
    private String motherboard;
    @NotNull
    private String powerSupply;
    private String description;
    @PastOrPresent
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate created;
    @NotNull
    private DeviceTypeEnum type;
    private MultipartFile picture;

    public ComputerBindingModel() {
    }

    public String getModel() {
        return model;
    }

    public ComputerBindingModel setModel(String model) {
        this.model = model;
        return this;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public ComputerBindingModel setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
        return this;
    }

    public Integer getProcessorCores() {
        return processorCores;
    }

    public ComputerBindingModel setProcessorCores(Integer processorCores) {
        this.processorCores = processorCores;
        return this;
    }

    public Double getProcessorFrequency() {
        return processorFrequency;
    }

    public ComputerBindingModel setProcessorFrequency(Double processorFrequency) {
        this.processorFrequency = processorFrequency;
        return this;
    }

    public String getGpu() {
        return gpu;
    }

    public ComputerBindingModel setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public Integer getVideoCardMemory() {
        return videoCardMemory;
    }

    public ComputerBindingModel setVideoCardMemory(Integer videoCardMemory) {
        this.videoCardMemory = videoCardMemory;
        return this;
    }

    public String getVideoTypeOfMemory() {
        return videoTypeOfMemory;
    }

    public ComputerBindingModel setVideoTypeOfMemory(String videoTypeOfMemory) {
        this.videoTypeOfMemory = videoTypeOfMemory;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public ComputerBindingModel setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getComputerMemory() {
        return computerMemory;
    }

    public ComputerBindingModel setComputerMemory(String computerMemory) {
        this.computerMemory = computerMemory;
        return this;
    }

    public String getStorage() {
        return storage;
    }

    public ComputerBindingModel setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public String getMotherboard() {
        return motherboard;
    }

    public ComputerBindingModel setMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public ComputerBindingModel setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ComputerBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }


    public LocalDate getCreated() {
        return created;
    }

    public ComputerBindingModel setCreated(LocalDate created) {
        this.created = created;
        return this;
    }

    public DeviceTypeEnum getType() {
        return type;
    }

    public ComputerBindingModel setType(DeviceTypeEnum type) {
        this.type = type;
        return this;
    }

    public MultipartFile getPicture() {
        return picture;
    }

    public ComputerBindingModel setPicture(MultipartFile picture) {
        this.picture = picture;
        return this;
    }
}
