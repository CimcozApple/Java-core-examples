package tests.HW12_Exceptions;
//Write program which has method isWeatherGood(boolean isItRaining, int temperature, boolean isItSunny).
// In this method you have to verify variables and if it’s raining, temperature is below 10, and is not sunny
// then throw Exception(Weather is not good)

public class T2_ExceptionWeather_finish1 {

    public static void main(String[] args) throws BadWeatherException {
        System.out.println("Information about today's weather: ");

        isWeatherGood(true, 9, false);
        System.out.println("Exception thrown: ");
    }

    public static void isWeatherGood(boolean isItRaining, int temperature, boolean isItSunny) throws BadWeatherException {
        if ((isItRaining) && temperature < 10 && (isItSunny == false)) {
            throw new BadWeatherException("Weather is not good");
        } else {
            System.out.println("Weather is good");
        }
    }
}