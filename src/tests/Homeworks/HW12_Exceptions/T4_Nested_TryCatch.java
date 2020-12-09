package tests.HW12_Exceptions;
//Write program which has try-catch block inside of catch in try-catch block (with differ exception other then we had in class)

public class T4_Nested_TryCatch {

    public static void main(String[] args) {

        try {
            Object arrayString[] = new String[10];
            arrayString[0] = new Character('*');
        } catch (ArrayStoreException e) {
            System.out.println("Exception-1 thrown: " + e);

            try {
                Object ch = new Character('*');
                System.out.println((Byte) ch);
            } catch (ClassCastException e1) {
                System.out.println("Exception-2 thrown: " + e1);

                try {
                    int value = Integer.parseInt("text");
                    System.out.println("Result =" + value);
                } catch (NumberFormatException e2) {
                    System.out.println("Exception-3 thrown: " + e2);

                    try {
                        int[] score = new int[-1];
                    } catch (NegativeArraySizeException e3) {
                        System.out.println("Exception-4 thrown: " + e3);
                    }
                }
            }
        }
    }
}