package L14;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example {

  public static void main(String[] args) throws IOException {

    FileReader inputStream = null;
    FileWriter outputStream = null;
    String separator = File.separator;

    try {
      inputStream = new FileReader("C:" + separator + "myFolder\\test.txt");
      outputStream = new FileWriter("C:\\myFolder\\result.txt");

      int c;
      while ((c = inputStream.read()) != -1) {
        outputStream.write(c);
      }
      System.out.println(System.getProperty("user.home"));
    } finally {
      if (inputStream != null) {
        inputStream.close();
      }
      if (outputStream != null) {
        outputStream.close();
      }
    }
  }

}
