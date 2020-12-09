package tests.HW14_annotations_generics;
//Write program which contains class with 3 generics, each is used as type of variable inside of class.
// Add usage of class with generics, use different types of variables for generic

public class Task1_generics {

    public static void main(String[] args) {

        Provider<String, Integer, Boolean> provider = new Provider<>("PrivatBank", 123465, true);
        provider.printTypes();
    }
}

class Provider<T, N, S> {

    private T providerName;   //String
    private N accountNumber;  //Integer
    private S statusActive;   //Boolean

    public Provider(T providerName, N accountNumber, S statusActive) {
        this.providerName = providerName;
        this.accountNumber = accountNumber;
        this.statusActive = statusActive;
    }

    public void printTypes() {
        System.out.println("Provider Name: " + providerName
                + ", account Number: " + accountNumber
                + ", account status is Active: " + statusActive);
    }
}