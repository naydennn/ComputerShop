package bg.softuni.computershop.config;

import bg.softuni.computershop.service.RegisterStatInterceptorService;
import bg.softuni.computershop.web.interceptor.RegistryInterceptor;
import bg.softuni.computershop.web.interceptor.StatsInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {


    private StatsInterceptor statsInterceptor;
    private final RegistryInterceptor registryInterceptor;

    public WebConfiguration(StatsInterceptor statsInterceptor, RegistryInterceptor registryInterceptor) {
        this.statsInterceptor = statsInterceptor;
        this.registryInterceptor = registryInterceptor;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(this.statsInterceptor);
        registry.addInterceptor(this.registryInterceptor);
    }
}
