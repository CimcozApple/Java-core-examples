package L14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileListExample {

  public static final String firstFile = "C:\\Users\\INNA\\Desktop\\NewFolder_HW\\PREFIX_test1.txt";
  public static final String secondFile = "C:\\Users\\INNA\\Desktop\\NewFolder_HW\\test3.txt";

  public static void main(String[] args) {
    List<String> list = null;
    list = readFromFile(firstFile);

    System.out.println(list);
    System.out.println("\n\n");
    Collections.shuffle(list);
    System.out.println(list);
    writeToFile(secondFile, list);
  }

  public static List<String> readFromFile(String fileName) {
    Stream<String> stream = null;
    try {
      stream = Files.lines(Paths.get(fileName));
    } catch (IOException e) {
      e.printStackTrace();
    }
    return stream.collect(Collectors.toList());
  }

  public static void writeToFile(String fileName, List<String> list) {
    BufferedWriter bw = null;
    File fout = new File(fileName);
    FileOutputStream fos = null;
    try {
      fos = new FileOutputStream(fout);
      bw = new BufferedWriter(new OutputStreamWriter(fos));

      for (int i = 0; i < list.size(); i++) {
        bw.write(list.get(i));
        bw.newLine();
      }
    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      try {
        bw.close();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }
  }


}
