package bg.softuni.computershop.models.view;

public class LaptopViewModel {

    private String model;
    private String processorModel;
    private String videoCardGpu;
    private Integer ram;
    private String typeOfRam;
    private String hardDisk;
    private String pictureUrl;
    private Double price;
    private String type;
    private String color;
    private String display;

    public LaptopViewModel() {
    }

    public String getModel() {
        return model;
    }

    public LaptopViewModel setModel(String model) {
        this.model = model;
        return this;
    }

    public String getProcessorModel() {
        return processorModel;
    }

    public LaptopViewModel setProcessorModel(String processorModel) {
        this.processorModel = processorModel;
        return this;
    }

    public String getVideoCardGpu() {
        return videoCardGpu;
    }

    public LaptopViewModel setVideoCardGpu(String videoCardGpu) {
        this.videoCardGpu = videoCardGpu;
        return this;
    }

    public Integer getRam() {
        return ram;
    }

    public LaptopViewModel setRam(Integer ram) {
        this.ram = ram;
        return this;
    }

    public String getTypeOfRam() {
        return typeOfRam;
    }

    public LaptopViewModel setTypeOfRam(String typeOfRam) {
        this.typeOfRam = typeOfRam;
        return this;
    }

    public String getHardDisk() {
        return hardDisk;
    }

    public LaptopViewModel setHardDisk(String hardDisk) {
        this.hardDisk = hardDisk;
        return this;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public LaptopViewModel setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public LaptopViewModel setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getType() {
        return type;
    }

    public LaptopViewModel setType(String type) {
        this.type = type;
        return this;
    }

    public String getColor() {
        return color;
    }

    public LaptopViewModel setColor(String color) {
        this.color = color;
        return this;
    }

    public String getDisplay() {
        return display;
    }

    public LaptopViewModel setDisplay(String display) {
        this.display = display;
        return this;
    }
}
