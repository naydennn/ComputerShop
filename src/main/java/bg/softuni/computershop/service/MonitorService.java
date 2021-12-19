package bg.softuni.computershop.service;

import bg.softuni.computershop.models.binding.MonitorAddBindingModel;
import bg.softuni.computershop.models.binding.MonitorEditModel;
import bg.softuni.computershop.models.service.MonitorServiceModel;
import bg.softuni.computershop.models.view.MonitorDetailsViewModel;
import bg.softuni.computershop.models.view.MonitorViewModel;

import java.io.IOException;
import java.util.List;

public interface MonitorService {

    void addMonitor(MonitorServiceModel monitorServiceModel) throws IOException;

    List<MonitorViewModel> getAllMonitors();

    MonitorDetailsViewModel getMonitorDetailById(Long id);

    void deleteMonitor(Long id);

    void buyMonitor(Long id, String username);

    MonitorViewModel findById(Long id);

    void updateMonitor(Long id, MonitorEditModel monitorEditModel);
}
