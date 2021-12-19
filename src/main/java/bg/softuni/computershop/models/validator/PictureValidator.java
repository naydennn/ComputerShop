package bg.softuni.computershop.models.validator;

import org.springframework.web.multipart.MultipartFile;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PictureValidator  implements ConstraintValidator<PictureValidation, MultipartFile>{

    @Override
    public boolean isValid(MultipartFile value, ConstraintValidatorContext context) {
        return value.getSize() != 0;
    }
}
