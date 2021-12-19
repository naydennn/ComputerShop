package bg.softuni.computershop.models.binding;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class MonitorEditModel {

    private Long id;
    @NotNull
    @Size(min = 2, max = 50)
    private String model;
    @NotNull
    @Size(min = 2, max = 50)
    private String screen;
    @NotNull
    @Size(min = 2, max = 50)
    private String color;
    @NotNull
    @Positive
    private Double size;
    @Positive
    @NotNull
    private Double price;

    public Long getId() {
        return id;
    }

    public MonitorEditModel setId(Long id) {
        this.id = id;
        return this;
    }

    public String getModel() {
        return model;
    }

    public MonitorEditModel setModel(String model) {
        this.model = model;
        return this;
    }

    public String getScreen() {
        return screen;
    }

    public MonitorEditModel setScreen(String screen) {
        this.screen = screen;
        return this;
    }

    public Double getSize() {
        return size;
    }

    public MonitorEditModel setSize(Double size) {
        this.size = size;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public MonitorEditModel setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getColor() {
        return color;
    }

    public MonitorEditModel setColor(String color) {
        this.color = color;
        return this;
    }
}
