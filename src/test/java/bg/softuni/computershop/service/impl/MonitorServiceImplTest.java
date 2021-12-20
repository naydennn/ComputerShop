package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.entity.MonitorEntity;
import bg.softuni.computershop.models.entity.UserEntity;
import bg.softuni.computershop.models.view.LaptopViewModel;
import bg.softuni.computershop.models.view.MonitorViewModel;
import bg.softuni.computershop.repository.MonitorRepository;
import bg.softuni.computershop.service.CloudinaryService;
import bg.softuni.computershop.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.modelmapper.ModelMapper;

import java.util.Optional;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MonitorServiceImplTest {

    private MonitorServiceImpl testMonitorService;
    private UserEntity testUser;
    private MonitorEntity testMonitor;

    @Mock
    private ModelMapper modelMapper;
    @Mock
    private UserService userService;
    @Mock
    private CloudinaryService cloudinaryService;
    @Mock
    private MonitorRepository monitorRepository;

    @BeforeEach
    void setUp() {
        testMonitorService = new MonitorServiceImpl(modelMapper, cloudinaryService,
                monitorRepository, userService);
        testUser = new UserEntity();

        testUser.setUsername("test");
        testUser.setMoney(10000.0);

        testMonitor = new MonitorEntity();
        testMonitor.setId(1L);
        testMonitor.setModel("Asus");
        testMonitor.setPrice(1000.0);
        testMonitor.setUsers(Set.of(testUser));
    }

    @Test
    void addMonitor() {
    }

    @Test
    void getAllMonitors() {
    }

    @Test
    void getMonitorDetailById() {
    }

    @Test
    void deleteMonitor() {
    }

    @Test
    void findById() {
        MonitorViewModel monitorViewModel = new MonitorViewModel();
        monitorViewModel.setModel(testMonitor.getModel());
        monitorViewModel.setPrice(testMonitor.getPrice());
        monitorViewModel.setId(testMonitor.getId());

        Mockito.when(monitorRepository.findById(testMonitor.getId()))
                .thenReturn(Optional.of(testMonitor));
        Mockito.when(modelMapper.map(testMonitor, MonitorViewModel.class))
                .thenReturn(monitorViewModel);

        Optional<MonitorEntity> monitor = monitorRepository.findById(testMonitor.getId());

        Assertions.assertEquals(monitor.get().getModel(), testMonitor.getModel());
    }

    @Test
    void updateMonitor() {
    }
}