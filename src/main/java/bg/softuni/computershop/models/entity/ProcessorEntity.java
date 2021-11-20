package bg.softuni.computershop.models.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "proccesor")
public class ProcessorEntity extends BaseEntity{

    private String model;
    private Integer cores;
    private Double frequency;

    public ProcessorEntity() {
    }

    public String getModel() {
        return model;
    }

    public ProcessorEntity setModel(String model) {
        this.model = model;
        return this;
    }

    public Integer getCores() {
        return cores;
    }

    public ProcessorEntity setCores(Integer cores) {
        this.cores = cores;
        return this;
    }

    public Double getFrequency() {
        return frequency;
    }

    public ProcessorEntity setFrequency(Double frequency) {
        this.frequency = frequency;
        return this;
    }
}
