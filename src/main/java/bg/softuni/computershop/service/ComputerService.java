package bg.softuni.computershop.service;

import bg.softuni.computershop.models.service.ComputerServiceModel;
import bg.softuni.computershop.models.view.ComputerViewModel;

import java.io.IOException;
import java.util.List;

public interface ComputerService {

    void addComputer(ComputerServiceModel computerServiceModel) throws IOException;

    List<ComputerViewModel> getAllComputers();
}
