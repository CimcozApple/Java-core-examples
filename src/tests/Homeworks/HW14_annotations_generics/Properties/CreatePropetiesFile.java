package tests.HW14_annotations_generics.Properties;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class CreatePropetiesFile {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try {
            OutputStream output = new FileOutputStream("src/main/resources/config.properties");

            properties.setProperty("db.url", "localhost");
            properties.setProperty("browser", "Chrome, FireFox, Safari");
            properties.setProperty("db.user", "test-user");
            properties.setProperty("db.password", "password");
            properties.setProperty("web.timeout", "10");
            properties.setProperty("mobile.device.name", "iPhone6");
            properties.setProperty("mobile.iOS.version", "13.0.0");
            properties.setProperty("mobile.timeout", "5");
            properties.setProperty("setTestResults", "true");

            properties.store(output, null);
            System.out.println(properties);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
