package tests.HW17_Java_core_memory.Task2_marshal_unmarshall;

import tests.HW17_Java_core_memory.Task2_marshal_unmarshall.models.Message;
import tests.HW17_Java_core_memory.Task2_marshal_unmarshall.utils.XmlUtil;

public class Model_1_Main {

    public static void main(String[] args) {
        Message message = XmlUtil.Unmarshal("D:\\Иннуся\\Hillel - QA Automation\\Hillel Project - 1\\src\\tests\\HW17\\Task2_marshal_unmarshall\\resources\\FileToUnmarshall");

        message.setCustomerId("New ID");
        message.setCompanyName("New Name");
        message.setCustomerNumber(15);

        XmlUtil.Marshal(message,"D:\\Иннуся\\Hillel - QA Automation\\Hillel Project - 1\\src\\tests\\HW17\\Task2_marshal_unmarshall\\resources\\Model1_changed");
    }
}