package tests.HW17_Java_core_memory.Task2_marshal_unmarshall.utils;

import tests.HW17_Java_core_memory.Task2_marshal_unmarshall.models.Message;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileOutputStream;

public class XmlUtil {

    public static void Marshal(Message message, String filepath) {

        try {
            JAXBContext jContext = JAXBContext.newInstance(Message.class);
            Marshaller marshallObj = jContext.createMarshaller();
            marshallObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshallObj.marshal(message, new FileOutputStream(filepath));
            System.out.println(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Message Unmarshal(String filepath) {
        Message message = null;
        try {
            File file = new File(filepath);
            JAXBContext jContext = JAXBContext.newInstance(Message.class);
            Unmarshaller unmarshallerObj = jContext.createUnmarshaller();
            message = (Message) unmarshallerObj.unmarshal(file);
            System.out.println(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return message;
    }
}
