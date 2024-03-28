package zerobase.weather.error;

public class InvalidDate extends RuntimeException{
    private static final String MESSAGE = "너무 과거 or 미래임";

    public InvalidDate() {
        super(MESSAGE);
    }
}
