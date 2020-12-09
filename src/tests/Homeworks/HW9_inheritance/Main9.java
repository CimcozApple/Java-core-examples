package tests.HW9_inheritance;

public class Main9 {

    public static void Runner() {
        RoadBicycle1 roadBicycle = new RoadBicycle1();
        System.out.println("Default rudder depth = " + roadBicycle.getRudderDepth());
        roadBicycle.setRudderDepth(40);
        System.out.println("New rudder depth = " + roadBicycle.getRudderDepth());

        MountainBicycle1 mountainBicycle = new MountainBicycle1();
        System.out.println("Default seatHeight = " + mountainBicycle.getSeatHeight());
        mountainBicycle.setSeatHeight(69);
        System.out.println("New seatHeight = " + mountainBicycle.getSeatHeight());
        System.out.println();

        System.out.println("In MAIN:");
        roadBicycle.move();
        roadBicycle.changeGear(2);
        System.out.println("From Bicycle: id = " + roadBicycle.getId() + ", gear = " + roadBicycle.getGear());
        System.out.println();

        System.out.println("From Vehicle: model = " + mountainBicycle.getModel());
        mountainBicycle.applyBrake(100);
        mountainBicycle.speedUp(50);
        mountainBicycle.setModel("geep");
        System.out.println("New speed = " + mountainBicycle.speed + ", new model = " + mountainBicycle.getModel());;
        mountainBicycle.stop();
    }

    public static void main(String[] args) {
        //task 2
        Runner();
        System.out.println();

        //task 3
        Vehicle1 vehicle = new Vehicle1();
        Bicycle1 bicycle = new Bicycle1();
        vehicle.move();
        bicycle.move();

        Bicycle1 bicycle1 = new Bicycle1(10);
        System.out.println("bicycle1 gear = " + bicycle1.gear);

        Bicycle1 bicycle2 = new Bicycle1();
        System.out.println("bicycle2 gear = " + bicycle2.getGear());

        Bicycle1 bicycle3 = new Bicycle1(0, 7);
        System.out.println("bicycle3 gear = " + bicycle3.id + ", gear = " + bicycle3.getGear());

        System.out.println();

        //task 4 - Equals and "==" for Helicopter ("==" operator returns true only if the two references pointing to the same object in memory)
        Helicopter1 helicopter1 = new Helicopter1();
        Helicopter1 helicopter2 = new Helicopter1();
        helicopter1.Helicopter(200, 20, 25);
        helicopter2.Helicopter(200, 20, 25);
        Helicopter1 helicopter3 = helicopter1;

        System.out.println("helicopter1 equals helicopter2 -> " + helicopter1.equals(helicopter2));
        System.out.println("helicopter1 equals helicopter3 -> " + helicopter1.equals(helicopter3));

        int helicopter1Height = 20;
        int helicopter2Height = 20;
        int helicopter3Height = helicopter1Height;
        boolean input1 = helicopter1Height == helicopter2Height;
        boolean input2 = helicopter1Height == helicopter3Height;

        System.out.println("helicopter1Height == helicopter2Height ->" + input1);
        System.out.println("helicopter1Height == helicopter3Height ->" + input2);
        System.out.println();

        //task 4 - Equals and "==" for RoadBicycle

        RoadBicycle1 roadBicycle1 = new RoadBicycle1();
        RoadBicycle1 roadBicycle2 = new RoadBicycle1();
        roadBicycle1.RoadBicycle(100);
        roadBicycle2.RoadBicycle(100);
        RoadBicycle1 roadBicycle3 = roadBicycle1;

        System.out.println("roadBicycle1 equals roadBicycle2 -> " + roadBicycle1.equals(roadBicycle2));
        System.out.println("roadBicycle1 equals roadBicycle3 -> " + roadBicycle1.equals(roadBicycle3));

        int roadBicycleA = 20;
        int roadBicycleB = 20;
        int roadBicycleC = roadBicycleA;
        boolean inp1 = roadBicycleA == roadBicycleB;
        boolean inp2 = roadBicycleA == roadBicycleC;

        System.out.println("roadBicycleA == roadBicycleB ->" + inp1);
        System.out.println("roadBicycleA == roadBicycleC ->" + inp2);
        System.out.println();

        //task 5
        Cars orangeCar = new Cars();
        orangeCar.carType = "sedan";
        orangeCar.transmission = "transmission1";
        System.out.println("Car type: " + orangeCar.carType + ", transmission: " + orangeCar.transmission);
    }
}