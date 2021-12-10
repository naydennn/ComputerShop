package bg.softuni.computershop.service.impl;

import bg.softuni.computershop.models.view.RegisterViewModel;
import bg.softuni.computershop.service.RegisterStatInterceptorService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

@Service
public class RegisterStatInterceptorImpl implements RegisterStatInterceptorService {
    private int registerRequests;

    @Override
    public void onRequest(HttpServletRequest request) {
        if (request.getRequestURL().toString().contains("register")
                && request.getMethod().equalsIgnoreCase("get")) {
            registerRequests++;
        }
    }

    @Override
    public RegisterViewModel getViews() {
        return new RegisterViewModel(this.registerRequests);
    }
}
