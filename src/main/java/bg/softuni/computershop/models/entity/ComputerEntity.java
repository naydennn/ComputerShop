package bg.softuni.computershop.models.entity;

import bg.softuni.computershop.models.enums.DeviceTypeEnum;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "computers")
public class ComputerEntity extends BaseEntity {

    private String model;
    private String processor;
    private Double price;
    private String videoCard;
    private String memory;
    private String storage;
    private String motherboard;
    private String powerSupply;
    private String description;
    private LocalDateTime created;
    private DeviceTypeEnum type;
    private UserEntity user;

    public ComputerEntity() {
    }

    @Column(nullable = false)
    public String getModel() {
        return model;
    }

    public ComputerEntity setModel(String model) {
        this.model = model;
        return this;
    }

    @Column(nullable = false)
    public String getProcessor() {
        return processor;
    }

    public ComputerEntity setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    @Column(nullable = false)
    public Double getPrice() {
        return price;
    }

    public ComputerEntity setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public ComputerEntity setVideoCard(String videoCard) {
        this.videoCard = videoCard;
        return this;
    }

    @Column(nullable = false)
    public String getMemory() {
        return memory;
    }

    public ComputerEntity setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    @Column(nullable = false)
    public String getStorage() {
        return storage;
    }

    public ComputerEntity setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Column(nullable = false)
    public String getMotherboard() {
        return motherboard;
    }

    public ComputerEntity setMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }

    @Column(nullable = false)
    public String getPowerSupply() {
        return powerSupply;
    }

    public ComputerEntity setPowerSupply(String powerSupply) {
        this.powerSupply = powerSupply;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public ComputerEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    @Column(nullable = false)
    public LocalDateTime getCreated() {
        return created;
    }

    public ComputerEntity setCreated(LocalDateTime createdOn) {
        this.created = createdOn;
        return this;
    }

    @Enumerated(EnumType.STRING)
    public DeviceTypeEnum getType() {
        return type;
    }

    public ComputerEntity setType(DeviceTypeEnum type) {
        this.type = type;
        return this;
    }

    @ManyToOne
    public UserEntity getUser() {
        return user;
    }

    public ComputerEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }
}
