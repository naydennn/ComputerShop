package bg.softuni.computershop.models.view;


public class ComputerViewModel {

    private String model;
    private String processorModel;
    private String videoCardGpu;
    private Integer ram;
    private String typeOfRam;
    private String storage;
    private String pictureUrl;
    private Double price;

    public ComputerViewModel() {
    }

    public String getModel() {
        return model;
    }

    public ComputerViewModel setModel(String model) {
        this.model = model;
        return this;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public ComputerViewModel setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
        return this;
    }

    public String getVideoCardGpu() {
        return videoCardGpu;
    }

    public ComputerViewModel setVideoCardGpu(String videoCardGpu) {
        this.videoCardGpu = videoCardGpu;
        return this;
    }

    public Integer getRam() {
        return ram;
    }

    public ComputerViewModel setRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public String getTypeOfRam() {
        return typeOfRam;
    }

    public ComputerViewModel setTypeOfRam(String typeOfRam) {
        this.typeOfRam = typeOfRam;
        return this;
    }

    public String getStorage() {
        return storage;
    }

    public ComputerViewModel setStorage(String storage) {
        this.storage = storage;
        return this;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public ComputerViewModel setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public ComputerViewModel setPrice(Double price) {
        this.price = price;
        return this;
    }
}
