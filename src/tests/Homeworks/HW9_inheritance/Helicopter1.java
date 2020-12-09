package tests.HW9_inheritance;

public class Helicopter1 extends Vehicle1 {

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
        Helicopter1 helicopter = (Helicopter1) obj;
        return (amountOfPassengers == helicopter.amountOfPassengers
                && maxHeight == helicopter.maxHeight
                && tankSize == helicopter.tankSize);
    }

    @Override
    public String toString() {
        return  "Helicopter {" +
                "amountOfPassengers ='" + amountOfPassengers + '\'' +
                ", maxHeight ='" + maxHeight + '\'' +
                ", tankSize ='" + tankSize + '\'' +
                '}';
    }
}
