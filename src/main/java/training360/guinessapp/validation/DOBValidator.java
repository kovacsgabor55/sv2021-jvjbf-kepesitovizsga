package training360.guinessapp.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

public class DOBValidator implements ConstraintValidator<DOB, LocalDate> {

    @Override
    public void initialize(DOB constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(LocalDate dob, ConstraintValidatorContext constraintValidatorContext) {

        return (dob!=null &&  dob.isBefore(LocalDate.now()));
    }
}
