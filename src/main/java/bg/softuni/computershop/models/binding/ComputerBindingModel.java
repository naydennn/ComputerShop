package bg.softuni.computershop.models.binding;

import bg.softuni.computershop.models.enums.DeviceTypeEnum;
import bg.softuni.computershop.models.validator.PictureValidation;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class ComputerBindingModel {

    @NotNull
    @Size(min = 2, max = 50)
    private String model;
    @NotNull
    @Size(min = 2, max = 50)
    private String processorModel;
    @NotNull
    @Positive
    private Integer processorCores;
    @NotNull
    @Positive
    private Double processorFrequency;
    @NotNull
    @Size(min = 2, max = 50)
    private String videoCardGpu;
    @NotNull
    @Positive
    private Integer videoCardMemory;
    @NotNull
    @Size(min = 2, max = 10)
    private String videoCardTypeOfMemory;
    @NotNull
    @Positive
    private Integer ram;
    @NotNull
    @Size(min = 2, max = 10)
    private String typeOfRam;
    @NotNull
    @Positive
    private Double price;
    @NotNull
    private String storage;
    @NotNull
    @Size(min = 2, max = 50)
    private String motherboard;
    @NotNull
    @Positive
    private String powerSupply;
    private String description;
    @PastOrPresent
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate created;
    @NotNull
    private DeviceTypeEnum type;
    @PictureValidation
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

    public String getVideoCardGpu() {
        return videoCardGpu;
    }

    public ComputerBindingModel setVideoCardGpu(String videoCardGpu) {
        this.videoCardGpu = videoCardGpu;
        return this;
    }

    public Integer getVideoCardMemory() {
        return videoCardMemory;
    }

    public ComputerBindingModel setVideoCardMemory(Integer videoCardMemory) {
        this.videoCardMemory = videoCardMemory;
        return this;
    }

    public String getVideoCardTypeOfMemory() {
        return videoCardTypeOfMemory;
    }

    public ComputerBindingModel setVideoCardTypeOfMemory(String videoCardTypeOfMemory) {
        this.videoCardTypeOfMemory = videoCardTypeOfMemory;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public ComputerBindingModel setPrice(Double price) {
        this.price = price;
        return this;
    }

    public Integer getRam() {
        return ram;
    }

    public ComputerBindingModel setRam(Integer ram) {
        this.ram = ram;
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

    public String getTypeOfRam() {
        return typeOfRam;
    }

    public ComputerBindingModel setTypeOfRam(String typeOfRam) {
        this.typeOfRam = typeOfRam;
        return this;
    }
}
