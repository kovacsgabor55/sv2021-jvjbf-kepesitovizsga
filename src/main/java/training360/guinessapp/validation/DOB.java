package training360.guinessapp.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
@Constraint(validatedBy = DOBValidator.class)
public @interface DOB {

    String message() default "must be in the past";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}