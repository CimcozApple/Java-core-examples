package tests.dop.lesson1;

public class LoopControl {
    public static void main(String[] args) {
        String[] students = {"John", "Steve", "Jake", "Nasty"};
        for (String student : students) {
            System.out.println(student);

//        for(int i = 0; i < students.length; i++) {
//            System.out.println("i " + i);
//            String student = students[i];
//            if(student.equals("Steve")) {
//                continue;
//            }
//            System.out.println(students[i]);
        }
    }
}
