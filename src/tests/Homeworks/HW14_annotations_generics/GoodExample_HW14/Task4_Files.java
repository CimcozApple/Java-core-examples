package tests.HW14_annotations_generics.GoodExample_HW14;

import java.io.File;
import java.util.*;

/*
(40 points) Create program which shuffle 10 files in folder
(files receive new order in folder). After every run of
program files are shuffled in new order. Length of file names is constant
Перед запуском программы смотришь, в каком порядке файлы в папке.
Запускаешь программу. После окончания ее работы заходишь в папку
и файлы уже в другом порядке, по ому что переименованы
 */

public class Task4_Files {
    public static void main(String args[]) {
        File filesPath = new File("/Users/tetianahvozdieva/Desktop/AQA/AQA_Hillel/src/HomeWork/HW14/FileFolder");
        //   File filesPath = new File("path");
        File[] file = filesPath.listFiles();
        shuffle(file);
    }

    private static void shuffle(File[] file) {
        Random random = new Random();
        for (int i = 0; i < file.length; i++) {
            String name = file[i].getName();
            name = (random.nextInt(899) + 100) + name.substring(3);
            file[i].renameTo(new File("/Users/tetianahvozdieva/Desktop/AQA/AQA_Hillel/src/HomeWork/HW14/FileFolder/" + name));
        }
        System.out.println("Done");
    }
}
