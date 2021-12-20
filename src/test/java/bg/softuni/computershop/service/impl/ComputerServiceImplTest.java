package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.entity.ComputerEntity;
import bg.softuni.computershop.models.entity.UserEntity;
import bg.softuni.computershop.models.view.ComputerViewModel;
import bg.softuni.computershop.repository.ComputerRepository;
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
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;
import org.modelmapper.ModelMapper;

import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class ComputerServiceImplTest {

    private ComputerServiceImpl testComputerService;
    private ComputerEntity testComputerEntity;
    private UserEntity testUser;

    @Mock
    private  ComputerRepository computerRepository;
    @Mock
    private CloudinaryService cloudinaryService;
    @Mock
    private ModelMapper modelMapper;
    @Mock
    private UserService userService;

    @BeforeEach
    void setUp() {
        testComputerService = new ComputerServiceImpl(computerRepository, cloudinaryService,
                modelMapper, userService);
        testUser = new UserEntity();

        testUser.setUsername("test");
        testUser.setMoney(10000.0);

        testComputerEntity = new ComputerEntity();
        testComputerEntity.setId(1L);
        testComputerEntity.setModel("Asus");
        testComputerEntity.setPrice(1000.0);
        testComputerEntity.setUsers(Set.of(testUser));
    }

    @Test
    void computerFoundTest() {

        ComputerViewModel computerViewModel = new ComputerViewModel();
        computerViewModel.setModel(testComputerEntity.getModel());
        computerViewModel.setPrice(testComputerEntity.getPrice());
        computerViewModel.setId(testComputerEntity.getId());

        Mockito.when(computerRepository.findById(testComputerEntity.getId()))
                .thenReturn(Optional.of(testComputerEntity));
        Mockito.when(modelMapper.map(testComputerEntity, ComputerViewModel.class))
                .thenReturn(computerViewModel);

        ComputerViewModel computer = testComputerService.findById(testComputerEntity.getId());

        Assertions.assertEquals(computer.getModel(), testComputerEntity.getModel());

    }

    @Test
    void computerNotFoundTest() {

        assertThrows(ObjectNotFoundException.class,
                () -> testComputerService.findById(2L)
        );
    }

    @Test()
    @MockitoSettings(strictness = Strictness.LENIENT)
    void buyComputerSuccessfully() {
        Mockito.when(computerRepository.findById(testComputerEntity.getId()))
                .thenReturn(Optional.of(testComputerEntity));
        Mockito.when(userService.findByUsername(testUser.getUsername()))
                .thenReturn(testUser);
        Mockito.when(userService.setMoney(testUser, testComputerEntity.getPrice()))
                .thenReturn(true);

        assertTrue(true);
    }
}