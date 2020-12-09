package tests.HW12_Exceptions;
//Write program which has method isWeatherGood(boolean isItRaining, int temperature, boolean isItSunny).
// In this method you have to verify variables and if it’s raining, temperature is below 10, and is not sunny
// then throw Exception(Weather is not good)

public class T2_ExceptionWeather_finish0 {

    public static void main(String[] args) {
        System.out.println("Information about today's weather: ");

        try {
            isWeatherGood(true, 9, false);
        } catch (BadWeatherException e) {
            System.out.println("Exception thrown: " + e);
        }
    }

    public static void isWeatherGood(boolean isItRaining, int temperature, boolean isItSunny) throws BadWeatherException {
        if ((isItRaining) && temperature < 10 && (isItSunny == false)) {
            throw new BadWeatherException("Weather is not good");
        } else {
            System.out.println("Weather is good");
        }
    }
}