package bg.softuni.computershop.models.entity;

import bg.softuni.computershop.models.enums.ConnectionTypeEnum;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "monitors")
public class MonitorEntity extends BaseEntity {

    private String model;
    private String screen;
    private Double size;
    private String color;
    private List<ConnectionTypeEnum> connectionType;
    private Double price;
    private String description;
    private LocalDate created;
    private UserEntity user;
    private PictureEntity picture;

    public MonitorEntity() {
    }
    @Column(nullable = false)
    public String getModel() {
        return model;
    }

    public MonitorEntity setModel(String model) {
        this.model = model;
        return this;
    }

    @Column(nullable = false)
    public String getScreen() {
        return screen;
    }

    public MonitorEntity setScreen(String screen) {
        this.screen = screen;
        return this;
    }

    @Column(nullable = false)
    public Double getSize() {
        return size;
    }

    public MonitorEntity setSize(Double size) {
        this.size = size;
        return this;
    }

    @Column(nullable = false)
    public Double getPrice() {
        return price;
    }

    public MonitorEntity setPrice(Double price) {
        this.price = price;
        return this;
    }

    @Column(nullable = false)
    public LocalDate getCreated() {
        return created;
    }

    public MonitorEntity setCreated(LocalDate created) {
        this.created = created;
        return this;
    }

    @Column(nullable = false, columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public MonitorEntity setDescription(String description) {
        this.description = description;
        return this;
    }

    @ManyToOne
    public UserEntity getUser() {
        return user;
    }

    public MonitorEntity setUser(UserEntity user) {
        this.user = user;
        return this;
    }

    @OneToOne(cascade = CascadeType.ALL)
    public PictureEntity getPicture() {
        return picture;
    }

    public MonitorEntity setPicture(PictureEntity picture) {
        this.picture = picture;
        return this;
    }

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "connections_types", joinColumns = @JoinColumn(name = "monitor_id"))
    @Enumerated(EnumType.STRING)
    public List<ConnectionTypeEnum> getConnectionType() {
        return connectionType;
    }

    public MonitorEntity setConnectionType(List<ConnectionTypeEnum> connectionType) {
        this.connectionType = connectionType;
        return this;
    }

    @Column(nullable = false)
    public String getColor() {
        return color;
    }

    public MonitorEntity setColor(String color) {
        this.color = color;
        return this;
    }
}
