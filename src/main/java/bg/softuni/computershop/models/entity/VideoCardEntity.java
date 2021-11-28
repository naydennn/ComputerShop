package bg.softuni.computershop.models.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "video_cards")
public class VideoCardEntity extends BaseEntity {

    private String gpu;
    private Integer memory;
    private String typeOfMemory;

    public VideoCardEntity() {
    }

    public String getGpu() {
        return gpu;
    }

    public VideoCardEntity setGpu(String gpu) {
        this.gpu = gpu;
        return this;
    }

    public Integer getMemory() {
        return memory;
    }

    public VideoCardEntity setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }

    public String getTypeOfMemory() {
        return typeOfMemory;
    }

    public VideoCardEntity setTypeOfMemory(String typeOfMemory) {
        this.typeOfMemory = typeOfMemory;
        return this;
    }
}
