package tests.HW12_Exceptions;
//Write program which have variable which is null. Call toString() for this variable.
// Use try catch to handle NullPointerException.

public class T1_NullPointerException {

    public static void main(String[] args) {
        Integer number = null;

        try {
            number.toString();
            System.out.print("No Exceptions. Continue");
        } catch (NullPointerException e) {
            System.out.print("Exception thrown: " + e);   //result = NullPointerException because Integer value is null
        }
    }
}