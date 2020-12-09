package tests.HW17_Java_core_memory.task1_HeapError;
//1. Write program which create new objects in a loop and count the amount of iterations till “OutOfMemoryError: Java Heap Space error”
// is thrown by Java. Remember amount of iterations. Increase Heap size x2 (x3, x5). Run program after increasing of Heap size,
// compare amount of iteration on different heap size configuration. (Hint: it’s better to create new objects which have big size)

public class Task1_HeapMemotyError {

    public static void main(String[] args) {

        int counter = 1;
        int loopExecCounter = 0;
        int n = 300_000_000;
        int n2 = 54_500_000;

        long heapSize = Runtime.getRuntime().maxMemory();
        System.out.println("max heap memory: " + heapSize);
        long heapSize2 = Runtime.getRuntime().freeMemory();
        System.out.println("free memory: " + heapSize2);


        Student student[] = new Student[n];
        for (int i = 1; i < student.length; i += 1000) {
            student[i] = new Student();
            loopExecCounter = loopExecCounter + 1;
            //System.out.println("iteration no: " + loopExecCounter);
            counter++;
        }
        System.out.println("Number of iterations 1: " + loopExecCounter);

        long heapSize3 = Runtime.getRuntime().freeMemory();
        System.out.println("free memory: " + heapSize3);

        Student student1[] = new Student[n2];
        for (int i = 0; i < student.length; i += 1000) {
            student[i] = new Student();
            loopExecCounter = loopExecCounter + 1;
         //    System.out.println("iteration no: " + loopExecCounter);
            counter++;
        }
        System.out.print("Number of iterations 2: " + loopExecCounter);
    }

}