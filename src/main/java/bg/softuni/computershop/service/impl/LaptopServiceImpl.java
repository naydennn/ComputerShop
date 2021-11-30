package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.entity.CloudinaryImage;
import bg.softuni.computershop.models.entity.LaptopEntity;
import bg.softuni.computershop.models.entity.PictureEntity;
import bg.softuni.computershop.models.service.LaptopServiceModel;
import bg.softuni.computershop.models.view.LaptopViewModel;
import bg.softuni.computershop.repository.LaptopRepository;
import bg.softuni.computershop.service.CloudinaryService;
import bg.softuni.computershop.service.LaptopService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class LaptopServiceImpl implements LaptopService {

    private final ModelMapper modelMapper;
    private final CloudinaryService cloudinaryService;
    private final LaptopRepository laptopRepository;

    public LaptopServiceImpl(ModelMapper modelMapper, CloudinaryService cloudinaryService, LaptopRepository laptopRepository) {
        this.modelMapper = modelMapper;
        this.cloudinaryService = cloudinaryService;
        this.laptopRepository = laptopRepository;
    }

    @Override
    public void addLaptop(LaptopServiceModel laptopServiceModel) throws IOException {

        LaptopEntity laptop = modelMapper.map(laptopServiceModel, LaptopEntity.class);

        CloudinaryImage cloudinaryImage = cloudinaryService.upload(laptopServiceModel.getPicture());

        laptop.setPicture(new PictureEntity().setUrl(cloudinaryImage.getUrl()).setPublicId(cloudinaryImage.getPublicId()));

        laptopRepository.save(laptop);
    }

    @Override
    public List<LaptopViewModel> getAll() {

         return laptopRepository.findAll().stream()
                 .map(laptopEntity -> modelMapper.map(laptopEntity, LaptopViewModel.class))
                 .collect(Collectors.toList());
    }
}
