package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.entity.CloudinaryImage;
import bg.softuni.computershop.models.entity.MonitorEntity;
import bg.softuni.computershop.models.entity.PictureEntity;
import bg.softuni.computershop.models.service.MonitorServiceModel;
import bg.softuni.computershop.models.view.MonitorViewModel;
import bg.softuni.computershop.repository.MonitorRepository;
import bg.softuni.computershop.service.CloudinaryService;
import bg.softuni.computershop.service.MonitorService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class MonitorServiceImpl implements MonitorService {

    private final ModelMapper modelMapper;
    private final CloudinaryService cloudinaryService;
    private final MonitorRepository monitorRepository;

    public MonitorServiceImpl(ModelMapper modelMapper, CloudinaryService cloudinaryService, MonitorRepository monitorRepository) {
        this.modelMapper = modelMapper;
        this.cloudinaryService = cloudinaryService;
        this.monitorRepository = monitorRepository;
    }

    @Override
    public void addMonitor(MonitorServiceModel monitorServiceModel) throws IOException {
        MonitorEntity monitor = modelMapper.map(monitorServiceModel, MonitorEntity.class);

        CloudinaryImage cloudinaryImage = cloudinaryService.upload(monitorServiceModel.getPicture());

        monitor.setPicture(new PictureEntity().setPublicId(cloudinaryImage.getPublicId()).setUrl(cloudinaryImage.getUrl()));
        monitor.setConnectionType(monitorServiceModel.getConnections());

        monitorRepository.save(monitor);
    }

    @Override
    public List<MonitorViewModel> getAllMonitors() {

        return monitorRepository.findAll().stream()
                .map(monitorEntity -> modelMapper.map(monitorEntity, MonitorViewModel.class))
                .collect(Collectors.toList());
    }
}
