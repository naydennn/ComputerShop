package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.entity.*;
import bg.softuni.computershop.models.service.ComputerServiceModel;
import bg.softuni.computershop.models.view.ComputerViewModel;
import bg.softuni.computershop.repository.ComputerRepository;
import bg.softuni.computershop.service.*;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ComputerServiceImpl implements ComputerService {

    private final ComputerRepository computerRepository;
    private final CloudinaryService cloudinaryService;
    private final ModelMapper modelMapper;

    public ComputerServiceImpl(ComputerRepository computerRepository, CloudinaryService cloudinaryService, ModelMapper modelMapper) {
        this.computerRepository = computerRepository;
        this.cloudinaryService = cloudinaryService;
        this.modelMapper = modelMapper;
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
}
