package exceptions;

public class ExptTituloYearLengthError extends RuntimeException {
    private String message;
    public ExptTituloYearLengthError(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
