package bg.softuni.computershop.service;

import bg.softuni.computershop.models.view.StatsView;

public interface StatService {

    void onRequest();
    StatsView getStats();
}
