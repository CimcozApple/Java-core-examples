package tests.HW6;
//Write a Java program to print out the maximum occurring character in initial string.
// If there are few of them -> print them all

public class HW6_2_maxNumChar {
    public static void main(String[] args) {
        String text = "daaaabbbbvv";                 // a = 4, b = 4, v = 2
        System.out.println("Maximum occurring character is ");
        countMax(text);
    }

    //show only one max character
    static void countMax(String text) {
        char[] count = text.toCharArray();
        int[] result = new int[256];
        int max = -1;

        for (int i = 0; i < count.length; i++) {
            if (count[i] != ' ') {
                int j = count[i];
                result[j]++;
                if (result[j] > max) {
                    max = result[j];
                }
            }
        }

        for (int k = 0; k < result.length; k++) {
            if (max == result[(k)]) {
                char symbol = (char) k;
                System.out.println(symbol);
            }
        }
    }
}

        //this part doesn't work correctly
//        static char countMax2 (String text){
//            int max = -1;
//            char[] result = new char[256];
//            char result1 = ' ';
//            int j = 0;                                       // j - to find all maximum
//            for (int i = 0; i < text.length(); i++) {
//                if (text.charAt(i) != ' ') {
//                    if (max < text.charAt(i)) {
//                        max = text.charAt(i);
//                        j++;
//                        result[text.charAt(j)]++;
//                        result1 = text.charAt(j);
//                    }
//                }
//            }