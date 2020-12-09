package tests.HW10_interface_absctractclass;

public class Helicopter extends Vehicle implements Radio {

    int amountOfPassengers;
    int maxHeight;
    int tankSize;

    public void move() {
        System.out.println("Class Helicopter: helicopter moves");
    }

    void Helicopter(int amountOfPassengers, int maxHeight, int tankSize) {
        this.amountOfPassengers = amountOfPassengers;
        this.maxHeight = maxHeight;
        this.tankSize = tankSize;
    }

    void Helicopter(int maxHeight, int tankSize) {
        this.maxHeight = maxHeight;
        this.tankSize = tankSize;
    }

    @Override
    public void gas() {
        System.out.println("Helicopter: Turn on all red buttons before move the helicopter");
    }

    @Override
    public void applyBrake() {
        amountOfPassengers = 4;
        System.out.println("Helicopter: Need to brake speed because number of passengers = " + amountOfPassengers);
    }

    @Override
    public void startRadio() {
        System.out.println("Helicopter: find radiostation and start playing it");
    }

    @Override
    public void stopRadio() {
        System.out.println("Helicopter: radio signal was lost, stop playing");
    }

    @Override
    public void volumeUp() {
        System.out.println("Helicopter: make music louder in 2 points");
    }

    @Override
    public void volumeDown() {
        System.out.println("Helicopter: make music quieter in 1 point");
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + amountOfPassengers;
        result = prime * result + maxHeight;
        result = prime * result + tankSize;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Helicopter helicopter = (Helicopter) obj;
        return (amountOfPassengers == helicopter.amountOfPassengers
                && maxHeight == helicopter.maxHeight
                && tankSize == helicopter.tankSize);
    }

    @Override
    public String toString() {
        return "Helicopter {" +
                "amountOfPassengers ='" + amountOfPassengers + '\''
                + ", maxHeight ='" + maxHeight + '\''
                + ", tankSize ='" + tankSize + '\''
                + '}';
    }
}
