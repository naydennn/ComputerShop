package bg.softuni.computershop.service;

import bg.softuni.computershop.models.service.ComputerServiceModel;

import java.io.IOException;

public interface ComputerService {

    void addComputer(ComputerServiceModel computerServiceModel) throws IOException;
}
