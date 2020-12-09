package tests.dop.lesson1;

public class Task2 {
    public static void main(String[] args) {
        checkCircleInSquare(20, 5);
    }

    public static String checkCircleInSquare(double circleArea, double squareArea) {
        String result = "";
        if(Math.sqrt(squareArea) <= 2*Math.sqrt(circleArea/Math.PI)) {
            result = "The square is in the circle";
        } else {
            result = "The square is not in the circle";
        }
        return result;
    }
}
