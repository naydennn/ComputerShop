package bg.softuni.computershop.models.binding;

import bg.softuni.computershop.models.entity.UserEntity;
import bg.softuni.computershop.models.enums.DeviceTypeEnum;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import java.time.LocalDate;

public class LaptopBindingModel {

    @Size(min = 2, max = 50)
    @NotNull
    private String model;
    @Size(min = 2, max = 50)
    @NotNull
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
    @Size(min = 2, max = 50)
    private String videoCardTypeOfMemory;
    @NotNull
    @Positive
    private Integer ram;
    @NotNull
    @Size(min = 2, max = 10)
    private String typeOfRam;
    @Positive
    @NotNull
    private Double price;
    @NotNull
    private String hardDisk;
    @NotNull
    private String display;
    @NotNull
    @Size(min = 2, max = 10)
    private String color;
    @NotNull
    private String description;
    @PastOrPresent
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate created;
    @NotNull
    private DeviceTypeEnum type;
    private UserEntity user;
    @NotNull
    private MultipartFile picture;

    public LaptopBindingModel() {
    }

    public String getModel() {
        return model;
    }

    public LaptopBindingModel setModel(String model) {
        this.model = model;
        return this;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public LaptopBindingModel setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
        return this;
    }

    public Integer getProcessorCores() {
        return processorCores;
    }

    public LaptopBindingModel setProcessorCores(Integer processorCores) {
        this.processorCores = processorCores;
        return this;
    }

    public Double getProcessorFrequency() {
        return processorFrequency;
    }

    public LaptopBindingModel setProcessorFrequency(Double processorFrequency) {
        this.processorFrequency = processorFrequency;
        return this;
    }

    public String getVideoCardGpu() {
        return videoCardGpu;
    }

    public LaptopBindingModel setVideoCardGpu(String videoCardGpu) {
        this.videoCardGpu = videoCardGpu;
        return this;
    }

    public Integer getVideoCardMemory() {
        return videoCardMemory;
    }

    public LaptopBindingModel setVideoCardMemory(Integer videoCardMemory) {
        this.videoCardMemory = videoCardMemory;
        return this;
    }

    public String getVideoCardTypeOfMemory() {
        return videoCardTypeOfMemory;
    }

    public LaptopBindingModel setVideoCardTypeOfMemory(String videoCardTypeOfMemory) {
        this.videoCardTypeOfMemory = videoCardTypeOfMemory;
        return this;
    }

    public Integer getRam() {
        return ram;
    }

    public LaptopBindingModel setRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public String getTypeOfRam() {
        return typeOfRam;
    }

    public LaptopBindingModel setTypeOfRam(String typeOfRam) {
        this.typeOfRam = typeOfRam;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public LaptopBindingModel setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public LaptopBindingModel setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }

    public String getDisplay() {
        return display;
    }

    public LaptopBindingModel setDisplay(String display) {
        this.display = display;
        return this;
    }

    public String getColor() {
        return color;
    }

    public LaptopBindingModel setColor(String color) {
        this.color = color;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public LaptopBindingModel setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LaptopBindingModel setCreated(LocalDate created) {
        this.created = created;
        return this;
    }

    public DeviceTypeEnum getType() {
        return type;
    }

    public LaptopBindingModel setType(DeviceTypeEnum type) {
        this.type = type;
        return this;
    }

    public UserEntity getUser() {
        return user;
    }

    public LaptopBindingModel setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    public MultipartFile getPicture() {
        return picture;
    }

    public LaptopBindingModel setPicture(MultipartFile picture) {
        this.picture = picture;
        return this;
    }
}
