package tests.HW15_stream_lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonMain {

    public static void main(String[] args) {

        List<Person> personList = new ArrayList<Person>();
        personList.add(new Person("Jake", "25"));
        personList.add(new Person("Lora", "13"));
        personList.add(new Person("Samuel", "46"));
        personList.add(new Person("Richard", "67"));
        personList.add(new Person("Steven", "21"));

        Comparator<Person> comparatorName = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Comparator<Person> comparatorAge = new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.age.compareTo(o2.age);
            }
        };

        Collections.sort(personList, comparatorName);
        System.out.println("Sorting by name: ");
        personList.forEach(System.out::println);

        Collections.sort(personList, comparatorAge);
        System.out.println("Sorting by age: ");
        personList.forEach(System.out::println);
//      personList.forEach(person -> System.out.println(person + ","));     //second variant of printing result
    }
}