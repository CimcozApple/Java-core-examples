package tests.HW17_Java_core_memory.Task2_marshal_unmarshall.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

@XmlAccessorType(XmlAccessType.FIELD)
public class Issue {

    @XmlValue
    private String text;

    @XmlAttribute (name = "type")
    private String type;

    public Issue(){
    }

    public Issue(String text, String type) {
        this.text = text;
        this.type = type;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "\n"+ "Issue {" +
               "type = '" + type + '\'' +
               ", text = '" + text + '\'' +
                + '}';
    }
}
