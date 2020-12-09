package tests.HW14_annotations_generics.Properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PrintPopertiesKeyValue {

    public static void main(String[] args) throws Exception {
        String propertiesFilename = "src/main/resources/config.properties";
        Properties property = new Properties();
        InputStream input = new FileInputStream(propertiesFilename);

        try {
            input = new FileInputStream(propertiesFilename);
            property.load(input);

            Map<String, String> map = new HashMap<String, String>((Map) property);
            System.out.println("Map is: ");
            for (Map.Entry<String, String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " => " + entry.getValue());
            }
        } catch (IOException ex) {
            ex.printStackTrace();
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
