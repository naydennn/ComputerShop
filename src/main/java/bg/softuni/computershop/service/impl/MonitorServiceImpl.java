package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.entity.CloudinaryImage;
import bg.softuni.computershop.models.entity.MonitorEntity;
import bg.softuni.computershop.models.entity.PictureEntity;
import bg.softuni.computershop.models.entity.UserEntity;
import bg.softuni.computershop.models.service.MonitorServiceModel;
import bg.softuni.computershop.models.view.MonitorDetailsViewModel;
import bg.softuni.computershop.models.view.MonitorViewModel;
import bg.softuni.computershop.repository.MonitorRepository;
import bg.softuni.computershop.service.CloudinaryService;
import bg.softuni.computershop.service.MonitorService;
import bg.softuni.computershop.service.UserService;
import bg.softuni.computershop.service.exception.ObjectNotFoundException;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class MonitorServiceImpl implements MonitorService {

    private final ModelMapper modelMapper;
    private final CloudinaryService cloudinaryService;
    private final MonitorRepository monitorRepository;
    private final UserService userService;

    public MonitorServiceImpl(ModelMapper modelMapper, CloudinaryService cloudinaryService, MonitorRepository monitorRepository, UserService userService) {
        this.modelMapper = modelMapper;
        this.cloudinaryService = cloudinaryService;
        this.monitorRepository = monitorRepository;
        this.userService = userService;
    }

    @Override
    public void addMonitor(MonitorServiceModel monitorServiceModel) throws IOException {
        MonitorEntity monitor = modelMapper.map(monitorServiceModel, MonitorEntity.class);

        CloudinaryImage cloudinaryImage = cloudinaryService.upload(monitorServiceModel.getPicture());

        monitor.setPicture(new PictureEntity().setPublicId(cloudinaryImage.getPublicId()).setUrl(cloudinaryImage.getUrl()));

        monitorRepository.save(monitor);
    }

    @Override
    public List<MonitorViewModel> getAllMonitors() {

        return monitorRepository.findAll().stream()
                .map(monitorEntity -> modelMapper.map(monitorEntity, MonitorViewModel.class))
                .collect(Collectors.toList());
    }

    @Override
    public MonitorDetailsViewModel getMonitorDetailById(Long id) {

        MonitorEntity monitorEntity = monitorRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id));

        return modelMapper.map(monitorEntity, MonitorDetailsViewModel.class);
    }


    @Override
    public void deleteMonitor(Long id) {
        monitorRepository.deleteById(id);
    }

    @Override
    public void buyMonitor(Long id, String username) {
        UserEntity userEntity = userService.findByUsername(username);

        MonitorEntity monitorEntity = monitorRepository.findById(id).orElseThrow(() -> new ObjectNotFoundException(id));

        monitorEntity.setUsers(Set.of(userEntity));

        monitorRepository.save(monitorEntity);
    }

}
