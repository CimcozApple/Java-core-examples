package tests.HW14_annotations_generics.Annotations;
//Create your own annotation with 5 variables as metadata fields.
// Add usage of new annotation for class, method, variable.

@TestData(whoPassTest = TestData.TesterPosition.MIDDLE, timeToPass = "10 mins", sections = "Buyers, Sellers")

public class Task2_own_annotation {

    public static void main(String[] args) {

        @ClientDetails(type = ClientDetails.ClientType.RETAIL, region = "London")
        String clientProduct = "Drinks";
        int employeesNumber = 25;

        System.out.println("Product name:" + clientProduct + ", number of employees: " + employeesNumber);
        checkTimeToDeliver();
    }

    @CheckLocalization(local = CheckLocalization.Localization.LONDON,
            currentTime = "12:00:00", description = "supply", region = "Old Town")

    public static void checkTimeToDeliver() {
        System.out.println("Check local time to get delivering time");
    }
}
