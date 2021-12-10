package bg.softuni.computershop.service;

import bg.softuni.computershop.models.view.RegisterViewModel;

import javax.servlet.http.HttpServletRequest;

public interface RegisterStatInterceptorService {

    void onRequest(HttpServletRequest request);

    RegisterViewModel getViews();
}
