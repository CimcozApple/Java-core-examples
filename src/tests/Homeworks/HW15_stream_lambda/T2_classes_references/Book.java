package tests.HW15_stream_lambda.T2_classes_references;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Book {

    String title;
    int numberOfPages;
    List<Author> authors;

    Book(String title, int numberOfPages, List<Author> authors) {
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return "Book {" +
                "title = " + title + '\'' +
                ", number of pages = " + numberOfPages +
              //  ", author =" + authors +
                '}';
    }
}