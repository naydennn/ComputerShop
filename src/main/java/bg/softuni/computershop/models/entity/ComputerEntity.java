package bg.softuni.computershop.models.entity;

import bg.softuni.computershop.models.enums.DeviceTypeEnum;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "computers")
public class ComputerEntity extends BaseEntity {

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
    public Double getPrice() {
        return price;
    }

    public ComputerEntity setPrice(Double price) {
        this.price = price;
        return this;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public VideoCardEntity getVideoCard() {
        return videoCard;
    }

    public ComputerEntity setVideoCard(VideoCardEntity videoCard) {
        this.videoCard = videoCard;
        return this;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public RamEntity getRam() {
        return ram;
    }

    public ComputerEntity setRam(RamEntity ram) {
        this.ram = ram;
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

    @Column(columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public ComputerEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    public LocalDate getCreated() {
        return created;
    }

    public ComputerEntity setCreated(LocalDate created) {
        this.created = created;
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

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public ProcessorEntity getProcessor() {
        return processor;
    }

    public ComputerEntity setProcessor(ProcessorEntity processor) {
        this.processor = processor;
        return this;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public PictureEntity getPicture() {
        return picture;
    }

    public ComputerEntity setPicture(PictureEntity pictureEntity) {
        this.picture = pictureEntity;
        return this;
    }
}
