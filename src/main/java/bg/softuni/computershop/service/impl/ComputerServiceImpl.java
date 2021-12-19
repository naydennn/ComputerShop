package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.binding.ComputerEditModel;
import bg.softuni.computershop.models.entity.*;
import bg.softuni.computershop.models.service.ComputerServiceModel;
import bg.softuni.computershop.models.view.ComputerDetailView;
import bg.softuni.computershop.models.view.ComputerViewModel;
import bg.softuni.computershop.models.view.MonitorViewModel;
import bg.softuni.computershop.repository.ComputerRepository;
import bg.softuni.computershop.service.*;
import bg.softuni.computershop.service.exception.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ComputerServiceImpl implements ComputerService {

    private final ComputerRepository computerRepository;
    private final CloudinaryService cloudinaryService;
    private final ModelMapper modelMapper;
    private final UserService userService;

    public ComputerServiceImpl(ComputerRepository computerRepository, CloudinaryService cloudinaryService, ModelMapper modelMapper, UserService userService) {
        this.computerRepository = computerRepository;
        this.cloudinaryService = cloudinaryService;
        this.modelMapper = modelMapper;
        this.userService = userService;
    }

    @Override
    public void addComputer(ComputerServiceModel computerServiceModel) throws IOException {
        ComputerEntity computer = modelMapper.map(computerServiceModel, ComputerEntity.class);

        CloudinaryImage cloudinaryImage = cloudinaryService.upload(computerServiceModel.getPicture());
        computer.setPicture(new PictureEntity().setPublicId(cloudinaryImage.getPublicId()).setUrl(cloudinaryImage.getUrl()));

        computerRepository.save(computer);
    }

    @Override
    public List<ComputerViewModel> getAllComputers() {
        return computerRepository.findAll().stream()
                .map(computerEntity -> modelMapper.map(computerEntity, ComputerViewModel.class))
                .collect(Collectors.toList());

    }

    @Override
    public ComputerDetailView getComputerDetailById(Long id) {
        ComputerEntity computerEntity = computerRepository.findById(id)
                .orElseThrow(() ->new ObjectNotFoundException(id));

        return modelMapper.map(computerEntity, ComputerDetailView.class);
    }

    @Override
    public void buyComputer(Long id, String username) {
        UserEntity userEntity = userService.findByUsername(username);
        ComputerEntity computerEntity = computerRepository.findById(id).get();

        if (userService.setMoney(userEntity, computerEntity.getPrice())) {

            computerEntity.setUsers(Set.of(userEntity));
            computerRepository.save(computerEntity);
        }


    }
    @Override
    public void deleteComputer(Long id) {
        computerRepository.deleteById(id);
    }

    @Override
    public ComputerViewModel findById(Long id) {

        ComputerEntity computerEntity = computerRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id));

        return modelMapper.map(computerEntity, ComputerViewModel.class);
    }

    @Override
    public void updateMonitor(Long id, ComputerEditModel computerEditModel) {
        ComputerEntity computerEntity = computerRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id));

        computerEntity.setPrice(computerEditModel.getPrice());
        computerEntity.setStorage(computerEditModel.getStorage());
        computerEntity.setStorage(computerEditModel.getStorage());
        computerEntity.setModel(computerEditModel.getModel());
        computerEntity.getRam().setRam(computerEditModel.getRam());
        computerEntity.getRam().setTypeOfRam(computerEditModel.getTypeOfRam());
        computerEntity.getProcessor().setModel(computerEditModel.getProcessorModel());

        computerRepository.save(computerEntity);
    }
}
