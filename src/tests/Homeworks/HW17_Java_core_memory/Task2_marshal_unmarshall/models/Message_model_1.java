package tests.HW17_Java_core_memory.Task2_marshal_unmarshall.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Message")
@XmlAccessorType(XmlAccessType.FIELD)
public class Message_model_1 {

    @XmlElement(name = "DateTime")
    String dateTime;
    @XmlElement(name = "CustomerId")
    String customerId;
    @XmlElement(name = "CompanyName")
    String companyName;

    public Message_model_1() {
    }

    public Message_model_1(String dateTime, String customerId, String companyName) {
        this.dateTime = dateTime;
        this.customerId = customerId;
        this.companyName = companyName;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "Message_model_1{" +
                "dateTime='" + dateTime + '\'' +
                ", customerId='" + customerId + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
