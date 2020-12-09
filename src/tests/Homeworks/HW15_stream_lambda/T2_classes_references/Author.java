package tests.HW15_stream_lambda.T2_classes_references;

import java.util.ArrayList;
import java.util.List;

public class Author {

    String name;
    short age;
    List<Book> books = new ArrayList<Book>();

    public Author(String name, short age, List<Book> books) {
        this.name = name;
        this.age = age;
        this.books = books;
    }

    public Author(String name, short age) {
        this.name = name;
        this.age = age;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Author {" +
                "name ='" + name + '\'' +
             //   ", books = " + books +
                ", age = " + age +
                '}';
    }
}