package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.entity.CloudinaryImage;
import bg.softuni.computershop.models.entity.LaptopEntity;
import bg.softuni.computershop.models.entity.PictureEntity;
import bg.softuni.computershop.models.entity.UserEntity;
import bg.softuni.computershop.models.service.LaptopServiceModel;
import bg.softuni.computershop.models.view.LaptopDetailsViewModel;
import bg.softuni.computershop.models.view.LaptopViewModel;
import bg.softuni.computershop.repository.LaptopRepository;
import bg.softuni.computershop.service.CloudinaryService;
import bg.softuni.computershop.service.LaptopService;
import bg.softuni.computershop.service.UserService;
import bg.softuni.computershop.service.exception.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class LaptopServiceImpl implements LaptopService {

    private final ModelMapper modelMapper;
    private final UserService userService;
    private final CloudinaryService cloudinaryService;
    private final LaptopRepository laptopRepository;

    public LaptopServiceImpl(ModelMapper modelMapper, UserService userService, CloudinaryService cloudinaryService, LaptopRepository laptopRepository) {
        this.modelMapper = modelMapper;
        this.userService = userService;
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

    @Override
    public LaptopDetailsViewModel getLaptopById(Long id) {

        LaptopEntity laptopEntity = laptopRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id));

        return modelMapper.map(laptopEntity, LaptopDetailsViewModel.class);
    }

    @Override
    public void buyLaptop(Long id, String username) {
        UserEntity userEntity = userService.findByUsername(username);

        LaptopEntity laptopEntity = laptopRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id));


        if (userService.setMoney(userEntity, laptopEntity.getPrice())) {
            laptopEntity.setUsers(Set.of(userEntity));
            laptopRepository.save(laptopEntity);
        }

    }

    @Override
    public void deleteLaptop(Long id) {
        laptopRepository.deleteById(id);
    }
}
