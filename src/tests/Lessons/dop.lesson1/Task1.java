package L3;

public class Task1 {
    public static void main(String[] args) {
        String result = checkNumberInInterval(0, 10, 15);
        System.out.println(result);
    }

    public static String checkNumberInInterval(int from, int to, int number) {
        String result = "";
        if(number >= from && number <= to) {
            result = String.format("Number %s belong to interval [%s;%s]", number, from, to);
        } else {
            result = String.format("Number %s not belong to interval [%s;%s]", number, from, to);
        }
        return result;
    }
}
