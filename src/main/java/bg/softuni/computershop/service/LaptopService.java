package bg.softuni.computershop.service;

import bg.softuni.computershop.models.service.LaptopServiceModel;
import bg.softuni.computershop.models.view.LaptopDetailsViewModel;
import bg.softuni.computershop.models.view.LaptopViewModel;

import java.io.IOException;
import java.util.List;

public interface LaptopService {

    void addLaptop(LaptopServiceModel laptopServiceModel) throws IOException;

    List<LaptopViewModel> getAll();

    LaptopDetailsViewModel getLaptopById(Long id);

    void buyLaptop(Long id, String username);

    void deleteLaptop(Long id);
}
