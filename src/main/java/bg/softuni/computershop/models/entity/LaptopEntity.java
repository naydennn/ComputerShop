package bg.softuni.computershop.models.entity;

import bg.softuni.computershop.models.enums.DeviceTypeEnum;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "laptops")
public class LaptopEntity extends BaseEntity{

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
    private PictureEntity picture;
    private Set<UserEntity> users;

    public LaptopEntity() {
    }

    public String getModel() {
        return model;
    }

    public LaptopEntity setModel(String model) {
        this.model = model;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public LaptopEntity setPrice(Double price) {
        this.price = price;
        return this;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public VideoCardEntity getVideoCard() {
        return videoCard;
    }

    public LaptopEntity setVideoCard(VideoCardEntity videoCard) {
        this.videoCard = videoCard;
        return this;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public RamEntity getRamEntity() {
        return ramEntity;
    }

    public LaptopEntity setRamEntity(RamEntity ramEntity) {
        this.ramEntity = ramEntity;
        return this;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public LaptopEntity setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }

    public String getDisplay() {
        return display;
    }

    public LaptopEntity setDisplay(String display) {
        this.display = display;
        return this;
    }

    public String getColor() {
        return color;
    }

    public LaptopEntity setColor(String color) {
        this.color = color;
        return this;
    }

    @Enumerated(EnumType.STRING)
    public DeviceTypeEnum getType() {
        return type;
    }

    public LaptopEntity setType(DeviceTypeEnum type) {
        this.type = type;
        return this;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public ProcessorEntity getProcessor() {
        return processor;
    }

    public LaptopEntity setProcessor(ProcessorEntity processor) {
        this.processor = processor;
        return this;
    }

    public LocalDate getCreated() {
        return created;
    }

    public LaptopEntity setCreated(LocalDate created) {
        this.created = created;
        return this;
    }

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    public PictureEntity getPicture() {
        return picture;
    }

    public LaptopEntity setPicture(PictureEntity picture) {
        this.picture = picture;
        return this;
    }

    @Column(columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public LaptopEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    public Set<UserEntity> getUsers() {
        return users;
    }

    public LaptopEntity setUsers(Set<UserEntity> users) {
        this.users = users;
        return this;
    }
}
