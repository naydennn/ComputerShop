package bg.softuni.computershop.web;

import bg.softuni.computershop.service.exception.ObjectNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionController {

    @ExceptionHandler({ObjectNotFoundException.class})
    public ModelAndView handleException(ObjectNotFoundException e){
        ModelAndView modelAndView = new ModelAndView("object-not-found");
        modelAndView.setStatus(HttpStatus.NOT_FOUND);
        modelAndView.addObject("productId", e.getProductId());

        return modelAndView;
    }
}
