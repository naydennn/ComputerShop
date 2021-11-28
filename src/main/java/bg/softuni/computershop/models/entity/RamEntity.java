package bg.softuni.computershop.models.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "ram_memory")
public class RamEntity extends BaseEntity {

    private Integer ram;
    private String typeOfRam;

    public RamEntity() {
    }

    public Integer getRam() {
        return ram;
    }

    public RamEntity setRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public String getTypeOfRam() {
        return typeOfRam;
    }

    public RamEntity setTypeOfRam(String typeOfRam) {
        this.typeOfRam = typeOfRam;
        return this;
    }
}
