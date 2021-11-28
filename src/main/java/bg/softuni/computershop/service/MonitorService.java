package bg.softuni.computershop.service;

import bg.softuni.computershop.models.service.MonitorServiceModel;

import java.io.IOException;

public interface MonitorService {

    void addMonitor(MonitorServiceModel monitorServiceModel) throws IOException;
}
