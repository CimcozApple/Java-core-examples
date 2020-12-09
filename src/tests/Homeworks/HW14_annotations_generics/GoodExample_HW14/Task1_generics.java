package tests.HW14_annotations_generics.GoodExample_HW14;

/*
Write program which contains class with 3 generics,
each is used as type of variable inside of class.
Add usage of class with generics, use different types of variables for generic
 */
public class Task1_generics<V, N, S> {
    V value;
    N number;
    S obj;

    public Task1_generics(V value, N number, S obj) {
        this.value = value;
        this.number = number;
        this.obj = obj;
    }

    public void printAll() {
        System.out.println("Print all fields use different types - " + value + " " + number + " " + obj);
    }
}
