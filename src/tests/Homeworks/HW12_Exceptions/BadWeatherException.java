package tests.HW12_Exceptions;

public class BadWeatherException extends Exception {
    String message;

    public BadWeatherException(String message) {
        this.message = message;
    }
}
