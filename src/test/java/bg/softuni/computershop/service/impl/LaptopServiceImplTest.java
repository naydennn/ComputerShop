package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.entity.LaptopEntity;
import bg.softuni.computershop.models.entity.PictureEntity;
import bg.softuni.computershop.models.entity.UserEntity;
import bg.softuni.computershop.models.view.LaptopViewModel;
import bg.softuni.computershop.repository.LaptopRepository;
import bg.softuni.computershop.service.CloudinaryService;
import bg.softuni.computershop.service.UserService;
import bg.softuni.computershop.service.exception.ObjectNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.modelmapper.ModelMapper;


import java.util.List;
import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class LaptopServiceImplTest {

    private LaptopServiceImpl testLaptopService;
    private UserEntity testUser;
    private LaptopEntity testLaptop;

    @Mock
    private ModelMapper modelMapper;
    @Mock
    private UserService userService;
    @Mock
    private CloudinaryService cloudinaryService;
    @Mock
    private LaptopRepository laptopRepository;

    @BeforeEach
    void setUp() {
        testLaptopService = new LaptopServiceImpl(modelMapper, userService,
                cloudinaryService, laptopRepository);
        testUser = new UserEntity();

        testUser.setUsername("test");
        testUser.setMoney(10000.0);

        testLaptop = new LaptopEntity();
        testLaptop.setId(1L);
        testLaptop.setModel("Asus");
        testLaptop.setPrice(1000.0);
        testLaptop.setPicture(new PictureEntity().setUrl("url").setPublicId("id"));
        testLaptop.setUsers(Set.of(testUser));
    }

    @Test
    void addLaptop() {
    }

    @Test
    void getAll() {
        LaptopViewModel laptopViewModel = getLaptopViewModel();

        Mockito.when(laptopRepository.findAll())
                .thenReturn(List.of(testLaptop));
        Mockito.when(modelMapper.map(testLaptop, LaptopViewModel.class))
                .thenReturn(laptopViewModel);

        List<LaptopViewModel> all = testLaptopService.getAll();

        assertEquals(all.get(0).getModel(), testLaptop.getModel());
    }

    @Test
    void deleteLaptop() {

    }

    @Test
    void findById() {
        LaptopViewModel laptopViewModel = getLaptopViewModel();

        Mockito.when(laptopRepository.findById(testLaptop.getId()))
                .thenReturn(Optional.of(testLaptop));
        Mockito.when(modelMapper.map(testLaptop, LaptopViewModel.class))
                .thenReturn(laptopViewModel);

        LaptopViewModel laptop = testLaptopService.findById(testLaptop.getId());

        Assertions.assertEquals(laptop.getModel(), testLaptop.getModel());
    }

    private LaptopViewModel getLaptopViewModel() {
        LaptopViewModel laptopViewModel = new LaptopViewModel();
        laptopViewModel.setModel(testLaptop.getModel());
        laptopViewModel.setPrice(testLaptop.getPrice());
        laptopViewModel.setId(testLaptop.getId());
        return laptopViewModel;
    }

    @Test
    void computerNotFoundTest() {

        assertThrows(ObjectNotFoundException.class,
                () -> testLaptopService.findById(2L)
        );
    }
}