package tests.HW17_Java_core_memory.Task2_marshal_unmarshall.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class MessageDetails {

    @XmlElement(name = "MessageId")
    Integer messageId;
    @XmlElement(name = "Datatype")
    String datatype;
    @XmlElement(name = "Type")
    String type;
    @XmlElement(name = "DatatypeDescription")
    String DatatypeDescription;
    @XmlElement(name = "OriginalFilename")
    String OriginalFilename;

    public Integer getMessageId() {
        return messageId;
    }

    public void setMessageId(Integer messageId) {
        this.messageId = messageId;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDatatypeDescription() {
        return DatatypeDescription;
    }

    public void setDatatypeDescription(String datatypeDescription) {
        DatatypeDescription = datatypeDescription;
    }

    public String getOriginalFilename() {
        return OriginalFilename;
    }

    public void setOriginalFilename(String originalFilename) {
        OriginalFilename = originalFilename;
    }

    @Override
    public String toString() {
        return "MessageDetails {" +
                "\nmessageId = " + messageId +
                ", \ndatatype = '" + datatype + '\'' +
                ", \ntype = '" + type + '\'' +
                ", \nDatatypeDescription = '" + DatatypeDescription + '\'' +
                ", \nOriginalFilename = '" + OriginalFilename + '\'' +
                '}';
    }
}
