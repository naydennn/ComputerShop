package bg.softuni.computershop.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "monitors")
public class MonitorEntity extends BaseEntity {

    private String model;
    private String screen;
    private String resolution;
    private String connectionType;
    private String description;
    private Double price;
    private LocalDateTime created;
    private UserEntity user;

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

    @Column(nullable = false)
    public String getConnectionType() {
        return connectionType;
    }

    public MonitorEntity setConnectionType(String connectionType) {
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
