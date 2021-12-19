package bg.softuni.computershop.models.binding;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class LaptopEditModel {

    private Long id;
    @Size(min = 2, max = 50)
    @NotNull
    private String model;
    @NotNull
    @Positive
    private Integer ram;
    @NotNull
    @Positive
    private Double price;
    @Size(min = 2, max = 20)
    @NotNull
    private String color;

    public LaptopEditModel() {
    }

    public Long getId() {
        return id;
    }

    public LaptopEditModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getModel() {
        return model;
    }

    public LaptopEditModel setModel(String model) {
        this.model = model;
        return this;
    }

    public Integer getRam() {
        return ram;
    }

    public LaptopEditModel setRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public LaptopEditModel setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getColor() {
        return color;
    }

    public LaptopEditModel setColor(String color) {
        this.color = color;
        return this;
    }
}
