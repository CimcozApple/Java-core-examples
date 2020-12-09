package tests.HW14_annotations_generics.Properties;
//Create program which read all pairs of values (more then 5 pairs) from property file
//and print them in console in view of map.

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties1 {
    public static void main(String[] args) {
        Properties properties = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("src/main/resources/config.properties");
            properties.load(input);
            System.out.println(properties.getProperty("db.url"));
            System.out.println("browser");
            System.out.println("db.user");
            System.out.println("db.password");
            System.out.println("web.timeout");
            System.out.println("mobile.device.name");
            System.out.println("mobile.iOS.version");
            System.out.println("mobile.timeout");
            System.out.println("setTestResults");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}