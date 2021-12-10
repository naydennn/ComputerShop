package bg.softuni.computershop.web;

import bg.softuni.computershop.service.RegisterStatInterceptorService;
import bg.softuni.computershop.service.StatService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StatsController {

    private final StatService statService;
    private final RegisterStatInterceptorService registerService;

    public StatsController(StatService statService, RegisterStatInterceptorService registerService) {
        this.statService = statService;
        this.registerService = registerService;
    }

    @GetMapping("/statistics")
    public ModelAndView stats() {
        ModelAndView modelAndView = new ModelAndView();

        modelAndView.addObject("stats", statService.getStats());
        modelAndView.addObject("registerStat", registerService.getViews());
        modelAndView.setViewName("stats");
        return modelAndView;
    }
}
