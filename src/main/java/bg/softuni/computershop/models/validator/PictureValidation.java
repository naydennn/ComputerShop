package bg.softuni.computershop.models.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target( { FIELD, PARAMETER, METHOD })
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = PictureValidator.class)
public @interface  PictureValidation {

        //error message
         String message() default "Picture is required";
        //represents group of constraints
         Class<?>[] groups() default {};
        //represents additional information about annotation
         Class<? extends Payload>[] payload() default {};
}
