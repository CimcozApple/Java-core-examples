package L4;

public class ForLoop {
    public static void main(String[] args) {
        String[] students = {"John", "Steve", "Jake", "Nasty"};

        for(int i = 0; i < students.length; i++) {
            System.out.println("i " + i);
            System.out.println(students[i]);
        }

        System.out.println();
        for (String student : students) {
            System.out.println(student);
        }

        System.out.println();
        for(int i = 0; i < students.length; i=i+2) {
            System.out.println("i " + i);
            System.out.println(students[i]);
        }
    }
}
