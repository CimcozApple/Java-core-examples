package tests.HW14_annotations_generics;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class FilesTest_vers2_withoutPrefix {

    public static void main(String[] args) throws IOException {

        // Create folder
        final String path = "C://Users//INNA//Desktop//NewFolder_HW";
        File dir = new File(path);
        if (!dir.exists()) {
            System.out.println("Create new folder");
            dir.mkdirs();
        }

        //Create 10 files
        for (int i = 1; i < 11; i++) {
            new File("C://Users//INNA//Desktop//NewFolder_HW", "Test" + i + ".txt").createNewFile();
        }

        //Get list of files
        List<String> listOfFiles = new ArrayList<>();
        for (File item : Objects.requireNonNull(dir.listFiles())) {
            listOfFiles.add(item.getName());
        }

        //shuffle files
        System.out.println("Before\n" + listOfFiles);
        Collections.shuffle(listOfFiles);
        System.out.println("After\n" + listOfFiles);
    }
}
