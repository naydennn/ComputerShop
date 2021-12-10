package bg.softuni.computershop.web.interceptor;

import bg.softuni.computershop.service.RegisterStatInterceptorService;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class RegistryInterceptor implements HandlerInterceptor {

    private RegisterStatInterceptorService registerStatInterceptorService;

    public RegistryInterceptor(RegisterStatInterceptorService registerStatInterceptorService) {
        this.registerStatInterceptorService = registerStatInterceptorService;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        this.registerStatInterceptorService.onRequest(request);
        return true;
    }
}
