package tests.HW17_Java_core_memory.Task2_marshal_unmarshall.models;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;

@XmlAccessorType(XmlAccessType.FIELD)
public class Issues {

    @XmlElement(name = "Issue")
    private ArrayList<Issue> issue;

    public Issues() {
    }

    public Issues(ArrayList<Issue> issue) {
        this.issue = issue;
    }

    public ArrayList<Issue> getIssue() {
        return issue;
    }

    public void setIssue(ArrayList<Issue> issue) {
        this.issue = issue;
    }

    @Override
    public String toString() {
        return "Issues{" +
                "issue=" + issue +
                '}';
    }
}
