package bg.softuni.computershop.service.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Object not found")
public class ObjectNotFoundException extends RuntimeException {

    private final Long productId;

    public ObjectNotFoundException(Long productId) {
        super("Cannot find product with id " + productId);
        this.productId = productId;
    }

    public Long getProductId() {
        return productId;
    }
}
