package tests.HW15_stream_lambda.T2_classes_references;
//1. Create the following classes: a. Author with fields: String name, short age, List<Book> books; b. Book with fields String title, List<Author> authors, int numberOfPages
//2. Create two arrays: Author[] authors and Book[] books. Their elements must use elements from the neighboring array.
//3. Create a stream of books and then:
//a. check if some/all book(s) have more than 200 pages;
//b. find the books with max and min number of pages;
//c. filter books with only single author;
//d. sort the books by number of pages/title;
//e. get list of all titles;
//f. print them using forEach method;
//g. get distinct list of all authors
//4. Use peek method for debugging intermediate streams during execution the previous task.
//5. Use parallel stream with subtask #3.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainBooks {
    public static void main(String[] args) {

        Book[] books = new Book[5];
        Author[] authors = new Author[5];

        List<Author> author = new ArrayList<Author>();
        author.add(0, new Author("Brown", (short) 2001));
        author.add(1, new Author("Ostin", (short) 2011));
        author.add(2, new Author("Pushkin", (short) 1978));
        author.add(3, new Author("Martin", (short) 2014));
        author.add(4, new Author("Mercury", (short) 1967));

        List<Book> books1 = new ArrayList<Book>();
        //books1.add(0, new Book("Insane", 561), new ArrayList<>(Arrays.asList(author[1])));
        books1.add(1, new Book("Homework", 1300));
        books1.add(2, new Book("Without solution", 195));
        books1.add(3, new Book("Crazy Crazy Tasks", 263));
        books1.add(4, new Book("Book 5", 157));






        //numberOfPages > 200
        System.out.println("numberOfPages > 200: ");
        books1.stream()
                .filter(s -> s.numberOfPages > 200)
                .map(s -> s.title)
                .collect(Collectors.toList())
                .forEach(System.out::println);

        //max numberOfPages
        Book bookMaxNumber = books1
                .stream()
                .max((book1, book2) -> book1.numberOfPages > book2.numberOfPages ? 1 : -1).get();
        System.out.println("max numberOfPages: " + bookMaxNumber.numberOfPages);

        //min numberOfPages
        Book bookMinNumber = books1
                .stream()
                .min((book1, book2) -> book1.numberOfPages < book2.numberOfPages ? -1 : 1).get();
        System.out.println("min numberOfPages: " + bookMinNumber.numberOfPages);

        //books with only single author  Not done


        //sort the books by number of pages ABC
        System.out.println("Sort by number of pages: ");
        books1.sort((Book book1, Book book2) -> book1.getNumberOfPages() - book2.getNumberOfPages());
        books1.forEach((book) -> System.out.println((book)));

        //sort the books by title
        System.out.println("Sort by title: ");
        books1.sort((Book book1, Book book2) -> book1.getTitle().compareTo(book2.getTitle()));
        books1.forEach((book) -> System.out.println((book)));

        //get list of all titles  Not done
//        Book bookAllTitles = books1
//                .collect(Collectors.groupingBy(book -> book.title));
//        System.out.println("list of all titles: " + bookAllTitles);

        //get distinct list of all authors
        System.out.println("distinct list of all authors: ");
        author.sort((Author author1, Author author2) -> author2.getName().compareTo(author1.getName()));
        author.forEach((author2) -> System.out.println((author2)));

        //peek method for debugging intermediate streams during execution
        System.out.println("Using peek method: ");
        books1.stream()
                .filter(s -> s.numberOfPages > 200)
                .peek(s -> System.out.println("number of pages: " + s.getNumberOfPages()))
                .map(s -> s.title)
                .peek(s -> System.out.println("book title: " + s))
                .collect(Collectors.toList())
                .forEach(System.out::println);

        // parallel stream
        System.out.println("Using Parallel stream: ");
        books1.parallelStream()
                .filter(s -> s.getNumberOfPages() > 200)
                .map(s -> s.title)
                .collect(Collectors.toList())
                .forEach(s -> System.out.println("Thread: " + Thread.currentThread().getName() + ", book: " + s));
    }
}