package tests.HW14_annotations_generics.GoodExample_HW14;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException {
        //Task1
//        HomeWork.HW14.Task1_generics<String, Integer, Boolean> obj = new HomeWork.HW14.Task1_generics("Test", 100, true);
//        obj.printAll();
//        System.out.println();
//
//        //Task2
//        System.out.println("From class");
//        String tagClass = HomeWork.HW14.Task2.class.getAnnotation(HomeWork.HW14.MyAnnotation.class).tag();
//        System.out.println(tagClass);
//
//        System.out.println("From method");
//        Method method = HomeWork.HW14.Task2.class.getMethod("printNewTask");
//        String lastModifiedInMethod = method.getAnnotation(HomeWork.HW14.MyAnnotation.class).lastModified();
//        System.out.println(lastModifiedInMethod);
//
//        System.out.println("From fieldFromClass");
//        HomeWork.HW14.Task2 task2 = new HomeWork.HW14.Task2();
//        Field[] fieldFromClass = task2.getClass().getDeclaredFields();
//        for (Field field : fieldFromClass) {
//            System.out.println("isAnnotationPresent - " + field.isAnnotationPresent(HomeWork.HW14.MyAnnotation.class));
//            System.out.println(field.getAnnotation(HomeWork.HW14.MyAnnotation.class));
//        }
    }
}
