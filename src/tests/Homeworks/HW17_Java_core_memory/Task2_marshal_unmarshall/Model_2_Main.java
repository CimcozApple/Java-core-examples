package tests.HW17_Java_core_memory.Task2_marshal_unmarshall;

import tests.HW17_Java_core_memory.Task2_marshal_unmarshall.models.Issue;
import tests.HW17_Java_core_memory.Task2_marshal_unmarshall.models.Message;
import tests.HW17_Java_core_memory.Task2_marshal_unmarshall.utils.XmlUtil;

public class Model_2_Main {

    public static void main(String[] args) {

        Message message = XmlUtil.Unmarshal("D:\\Иннуся\\Hillel - QA Automation\\Hillel Project - 1\\src\\tests\\HW17\\Task2_marshal_unmarshall\\resources\\File2_toUnmarshall");

        message.getIssues().getIssue().set(1, new Issue("Issue element 2", "3"));
        message.setCustomerId("ABCD");
        message.getMessageDetails().setMessageId(555);

        XmlUtil.Marshal(message, "D:\\Иннуся\\Hillel - QA Automation\\Hillel Project - 1\\src\\tests\\HW17\\Task2_marshal_unmarshall\\resources\\File2_changed");
    }
}