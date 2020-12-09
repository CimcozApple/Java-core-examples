package L5;

public class GeneralMethod {
     final int A = 1;

    public static void main(String[] args) {
        int[] data = new int[300-160+1];
        String result;
        int[] data2 = arrayOfCodes(data);
        result = arrayOfChars(data2);

        result = arrayOfChars(arrayOfCodes(data));
        System.out.print(result);
    }

    public static String arrayOfChars(int[] codes) {
        String result = "";
        char temp;
        for(int i = 0; i < codes.length; i++) {
            temp = (char)codes[i];
            result += temp + " ";
        }
        return result;
    }

    public static int[] arrayOfCodes(int[] data) {
        for (int i = 0; i < data.length; i++) {
            data[i] = i+160;
        }
        return data;
    }


}
