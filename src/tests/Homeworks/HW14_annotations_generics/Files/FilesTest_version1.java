package tests.HW14_annotations_generics;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FilesTest_version1 {

    public static void main(String[] args) throws IOException {
        final String directory = "C://Users//INNA//Desktop//NewFolder_HW";

        //Create 10 files and print in console
        for (int i = 1; i < 11; i++) {
            new File(directory, "Test" + i + ".txt").createNewFile();
        }
        System.out.println("Initial file names in a folder: ");
        readFromDirectory(directory);

        //Change name in folder and shuffle
        File[] files = new File(directory).listFiles();
        List listShuffle = (List) Arrays.asList(files);
        System.out.println("\nAfter random shuffle with new names:");

        for (File file : files) {
            if (file.isFile()) {
                String originalName = file.getName();
                String path = "C://Users//INNA//Desktop//NewFolder_HW//";          //without slashes at the end files moves to Desktop

                File newFileName = new File(path + generatePrefix(3) + "_" + originalName);
                Collections.sort(listShuffle);
                boolean success = file.renameTo(newFileName);
                if (!success) {
                    System.err.println("Failed to rename " + file.getName());
                } else {
                    System.out.println(newFileName.getName());
                }
            }
        }
    }

    public static void readFromDirectory(String path) {
        File folder = new File(path);
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {
            if (listOfFiles[i].isFile()) {
                System.out.println(listOfFiles[i].getName());   //names in folder
            } else if (listOfFiles[i].isDirectory()) {
                System.out.println(listOfFiles[i].getName());   //names of folders in the Path
            }
        }
    }

    public static String generatePrefix(int n) {
        StringBuilder prefix = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index = (int) ((Math.random()*10));
            prefix.append(index);
        }
        return prefix.toString();
    }
}