package se.melindasw.poetrygenerator.exceptions;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class AcrosticGeneratorException extends Exception {
    private String message;

    private String[] acrosticError = new String[]{
            "Error",
            "Really",
            "Returned",
            "Ordinary",
            "Results"
    };

    public AcrosticGeneratorException(String message, String[] error) {
        this.message = message;
        this.acrosticError = error;
    }
}
