package bg.softuni.computershop.models.view;

public class MonitorViewModel {

    private String model;
    private String screen;
    private Double size;
    private Double price;
    private String pictureUrl;

    public MonitorViewModel() {
    }

    public String getModel() {
        return model;
    }

    public MonitorViewModel setModel(String model) {
        this.model = model;
        return this;
    }

    public String getScreen() {
        return screen;
    }

    public MonitorViewModel setScreen(String screen) {
        this.screen = screen;
        return this;
    }

    public Double getSize() {
        return size;
    }

    public MonitorViewModel setSize(Double size) {
        this.size = size;
        return this;
    }

    public Double getPrice() {
        return price;
    }

    public MonitorViewModel setPrice(Double price) {
        this.price = price;
        return this;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public MonitorViewModel setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
        return this;
    }
}
