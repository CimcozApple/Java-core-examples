package tests.HW11_enum_varargs;

public class T2_main {
    public static void main(String[] args) {
        int number1 = 20;
        int number2 = 4;

        T2_MathOperator add = T2_MathOperator.ADD;
        T2_MathOperator subtract = T2_MathOperator.SUBTRACT;
        T2_MathOperator multiply = T2_MathOperator.MULTIPLY;
        T2_MathOperator divide = T2_MathOperator.DIVIDE;

        int result = (subtract.execute(number1, number2) + multiply.execute(number1, number2))
                / divide.execute(number1,number2) + add.execute(number1, number2);

      System.out.println("Result of add operation: " + + result);
    }
}
