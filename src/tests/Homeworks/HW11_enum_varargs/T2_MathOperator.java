package tests.HW11_enum_varargs;

public enum T2_MathOperator {
    ADD {
        @Override
        public int execute(int number1, int number2) {
            return number1 + number2;
        }
    },

    SUBTRACT {
        @Override
        public int execute(int number1, int number2) {
            return number1 - number2;
        }
    },

    MULTIPLY {
        @Override
        public int execute(int number1, int number2) {
            return number1 * number2;
        }
    },

    DIVIDE {
        @Override
        public int execute(int number1, int number2) {
            if (number2 != 0) {
                return number1 / number2;
            } else {
                System.out.println("Can't divide by zero.");
            }
            return 0;
        }
    };

    public abstract int execute(int number1, int number2);
}