package L3;

public class SwitchSt1 {
    public static void main(String[] args) {
        char character = 'B';
        switch (character) {
            case 'a':
                System.out.println("You selected " + 'a');
            case 'A':
                System.out.println("You selected " + 'A');
                break;
            default:
                System.out.println("Nothing selected!");
        }
    }
}
