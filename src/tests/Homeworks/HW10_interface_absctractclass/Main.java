package tests.HW10_interface_absctractclass;

public class Main {

    public static void main(String[] args) {

        Car newCar = new Car();
        newCar.setModel("sedan");
        newCar.speedUp(370, 100);
        System.out.println("Car model: " + newCar.getModel() + ", speed: " + newCar.speed);
        newCar.carType = "jeep";
        newCar.transmission = "CPU";
        System.out.println("Car type new: " + newCar.carType + ", transmission: " + newCar.transmission);
        System.out.println();
        newCar.updateMap();

        GPS.changeVoice();
        newCar.getCoordinates();
        newCar.getDirection();
        newCar.gas();
        newCar.applyBrake();
        newCar.move();                //get from vehicle
        newCar.stop();                //get from vehicle
        System.out.println();

        newCar.startRadio();
        newCar.volumeUp();
        Radio.changeStation();
        newCar.volumeDown();
        newCar.stopRadio();
        System.out.println();

        RoadBicycle roadBicycle = new RoadBicycle();
        roadBicycle.RoadBicycle(39);
        roadBicycle.setRudderDepth(51);
        System.out.println("New rudder depth in road-bicycle= " + roadBicycle.getRudderDepth());
        roadBicycle.changeGear();
        System.out.println("New gear in road-bicycle= " + roadBicycle.gear);
        roadBicycle.move();
        roadBicycle.applyBrake();
        System.out.println();

        MountainBicycle mountainBicycle = new MountainBicycle();
        mountainBicycle.setSeatHeight(71);
        System.out.println("New seatHeight in mountainBicycle = " + mountainBicycle.getSeatHeight());
        mountainBicycle.changeGear();
        System.out.println("Gear in new model of mountainBicycle = " + mountainBicycle.gear);
        System.out.println();

        Helicopter helicopter = new Helicopter();
        helicopter.Helicopter(3, 270, 25);
        System.out.println(helicopter.toString());
        helicopter.gas();
        helicopter.move();
        helicopter.applyBrake();
        helicopter.startRadio();
        helicopter.volumeUp();
        helicopter.volumeDown();
        helicopter.stopRadio();
    }
}