package bg.softuni.computershop.models.entity;

import bg.softuni.computershop.models.enums.ConnectionTypeEnum;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "monitors")
public class MonitorEntity extends BaseEntity {

    private String model;
    private String screen;
    private String resolution;
    private List<ConnectionTypeEnum> connectionType;
    private Double price;
    private String description;
    private LocalDateTime created;
    private UserEntity user;
    //add picture

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
    public String getResolution() {
        return resolution;
    }

    public MonitorEntity setResolution(String resolutions) {
        this.resolution = resolutions;
        return this;
    }

    @ElementCollection(targetClass = ConnectionTypeEnum.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "connections_types")
    @Column(name = "connections")
    public List<ConnectionTypeEnum> getConnectionType() {
        return connectionType;
    }

    public MonitorEntity setConnectionType(List<ConnectionTypeEnum> connectionType) {
        this.connectionType = connectionType;
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
    public LocalDateTime getCreated() {
        return created;
    }

    public MonitorEntity setCreated(LocalDateTime created) {
        this.created = created;
        return this;
    }

    @Column(nullable = false)
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
}
