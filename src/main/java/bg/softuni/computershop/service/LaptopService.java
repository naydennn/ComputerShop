package bg.softuni.computershop.service;

import bg.softuni.computershop.models.service.LaptopServiceModel;

import java.io.IOException;

public interface LaptopService {

    void addLaptop(LaptopServiceModel laptopServiceModel) throws IOException;
}
