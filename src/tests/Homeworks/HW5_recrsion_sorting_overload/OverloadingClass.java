package tests.HW5_recrsion_sorting_overload;
// class with overloading method

public class OverloadingClass {

    int add(int num1) {
        return num1;
    }

    int add(int num1, int num2) {
        return num1 + num2;
    }

    double add(double num1, int num2) {
        return num1 + num2 + 10;
    }

    double add(int num1, double num2) {
        return 2 * num1 + 2 * num2;
    }

    double add(int num1, float num2, String message) {
        return num1 + num2;
    }

    String add() {
        return "text";
    }
}
