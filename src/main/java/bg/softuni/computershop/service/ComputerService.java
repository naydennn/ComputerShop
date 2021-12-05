package bg.softuni.computershop.service;

import bg.softuni.computershop.models.entity.ComputerEntity;
import bg.softuni.computershop.models.service.ComputerServiceModel;
import bg.softuni.computershop.models.view.ComputerDetailView;
import bg.softuni.computershop.models.view.ComputerViewModel;

import java.io.IOException;
import java.util.List;

public interface ComputerService {

    void addComputer(ComputerServiceModel computerServiceModel) throws IOException;

    List<ComputerViewModel> getAllComputers();

    ComputerDetailView getComputerDetailById(Long id);

    void buyComputer(Long id, String username);

    void deleteComputer(Long id);
}
