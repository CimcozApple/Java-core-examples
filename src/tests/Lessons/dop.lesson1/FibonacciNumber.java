package L4;

public class FibonacciNumber {
    public static void main(String[] args) {
//        fillArray(result);
        int[] arr = getFibonacciNumbers(100);
        printArray(arr);
    }

    public static int[] getFibonacciNumbers(int number) {
        int[] result = new int[number];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i < number; i++) {
            result[i] = result[i-2] + result[i-1];
        }
        return result;
    }

    public static int[] fillArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
            array[i] = (int)Math.random();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int x : array) {
            System.out.print(x + " ");
        }
    }
}
