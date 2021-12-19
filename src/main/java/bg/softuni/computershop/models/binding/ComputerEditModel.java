package bg.softuni.computershop.models.binding;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class ComputerEditModel {

    private Long id;
    @NotNull
    @Size(min = 2, max = 50)
    private String model;
    @NotNull
    @Size(min = 2, max = 50)
    private String processorModel;
    @NotNull
    @Size(min = 2, max = 50)
    private String videoCardGpu;
    @NotNull
    @Positive
    private Integer ram;
    @NotNull
    @Size(min = 2, max = 10)
    private String typeOfRam;
    @NotNull
    @Positive
    private Double price;
    @NotNull
    private String storage;

    public ComputerEditModel() {
    }

    public String getModel() {
        return model;
    }

    public ComputerEditModel setModel(String model) {
        this.model = model;
        return this;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public ComputerEditModel setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
        return this;
    }


    public String getVideoCardGpu() {
        return videoCardGpu;
    }

    public ComputerEditModel setVideoCardGpu(String videoCardGpu) {
        this.videoCardGpu = videoCardGpu;
        return this;
    }


    public Integer getRam() {
        return ram;
    }

    public ComputerEditModel setRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public String getTypeOfRam() {
        return typeOfRam;
    }

    public ComputerEditModel setTypeOfRam(String typeOfRam) {
        this.typeOfRam = typeOfRam;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public ComputerEditModel setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getStorage() {
        return storage;
    }

    public ComputerEditModel setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public Long getId() {
        return id;
    }

    public ComputerEditModel setId(Long id) {
        this.id = id;
        return this;
    }
}
