package tests.HW17_Java_core_memory.Task2_marshal_unmarshall.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement (name = "Message")
@XmlAccessorType(XmlAccessType.FIELD)
public class Message {

    @XmlElement (name = "DateTime")
    String dateTime;
    @XmlElement (name = "CustomerId")
    String customerId;
    @XmlElement (name = "CompanyName")
    String companyName;
    @XmlElement (name = "CustomerNumber")
    Integer customerNumber;
    @XmlElement (name = "MessageDetails")
    private MessageDetails messageDetails;
    @XmlElement (name = "Issues")
    private Issues issues;

    public Message () {
    }

    public Message(String dateTime, String customerId, String companyName, Integer customerNumber,
                   MessageDetails messageDetails, Issues issues) {
        this.dateTime = dateTime;
        this.customerId = customerId;
        this.companyName = companyName;
        this.customerNumber = customerNumber;
        this.messageDetails = messageDetails;
        this.issues = issues;
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

    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
        this.customerNumber = customerNumber;
    }

    public MessageDetails getMessageDetails() {
        return messageDetails;
    }

    public void setMessageDetails(MessageDetails messageDetails) {
        this.messageDetails = messageDetails;
    }

    public Issues getIssues() {
        return issues;
    }

    public void setIssues(Issues issues) {
        this.issues = issues;
    }

    @Override
    public String toString() {
        return "Message{" +
                "\ndateTime='" + dateTime + '\'' +
                ", \ncustomerId='" + customerId + '\'' +
                ", \ncompanyName='" + companyName + '\'' +
                ", \ncustomerNumber=" + customerNumber +
                ", \nmessageDetails=" + messageDetails +
                ", \nissues=" + issues +
                '}';
    }
}