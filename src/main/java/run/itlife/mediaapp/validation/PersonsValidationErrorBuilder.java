package run.itlife.mediaapp.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;

import static org.springframework.http.HttpStatus.NOT_FOUND;

public class PersonsValidationErrorBuilder {

    public static PersonsValidationError fromBindingErrors(Errors errors) {
        PersonsValidationError error = new PersonsValidationError("Validation failed. " + errors.getErrorCount() + " error(s)");
        for (ObjectError objectError : errors.getAllErrors()) {
            error.addValidationError(objectError.getDefaultMessage());
        }
        return error;
    }
}
