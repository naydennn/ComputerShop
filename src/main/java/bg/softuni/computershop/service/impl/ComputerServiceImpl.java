package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.entity.*;
import bg.softuni.computershop.models.service.ComputerServiceModel;
import bg.softuni.computershop.models.service.PictureServiceModel;
import bg.softuni.computershop.repository.ComputerRepository;
import bg.softuni.computershop.service.*;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class ComputerServiceImpl implements ComputerService {

    private final ComputerRepository computerRepository;
    private final ProcessorService processorService;
    private final VideoCardService videoCardService;
    private final CloudinaryService cloudinaryService;
    private final PictureService pictureService;
    private final ModelMapper modelMapper;

    public ComputerServiceImpl(ComputerRepository computerRepository, ProcessorService processorService,
                               VideoCardService videoCardService, CloudinaryService cloudinaryService, PictureService pictureService, ModelMapper modelMapper) {
        this.computerRepository = computerRepository;
        this.processorService = processorService;
        this.videoCardService = videoCardService;
        this.cloudinaryService = cloudinaryService;
        this.pictureService = pictureService;
        this.modelMapper = modelMapper;
    }

    @Override
    public void addComputer(ComputerServiceModel computerServiceModel) throws IOException {
        ComputerEntity computer = modelMapper.map(computerServiceModel, ComputerEntity.class);

        CloudinaryImage cloudinaryImage = cloudinaryService.upload(computerServiceModel.getPicture());

        ProcessorEntity processor = new ProcessorEntity().setCores(computerServiceModel.getProcessorCores()).setFrequency(computerServiceModel.getProcessorFrequency())
                .setModel(computerServiceModel.getProcessorModel());
        VideoCardEntity videoCard = new VideoCardEntity().setGpu(computerServiceModel.getGpu()).setMemory(computerServiceModel.getVideoCardMemory())
                .setTypeOfMemory(computerServiceModel.getVideoTypeOfMemory());
        PictureEntity picture = new PictureEntity().setPublicId(cloudinaryImage.getPublicId()).setUrl(cloudinaryImage.getUrl());

        computerRepository.save(computer);
    }
}
