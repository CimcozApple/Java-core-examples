package tests.HW10_interface_absctractclass;

public abstract class Vehicle {

    int speed = 250;
    private String model = "truck";

    public abstract void gas();

    public abstract void applyBrake();

    void speedUp(int value){
        speed += value;
    };

    void speedUp(int max, int value) {
        speed = value + (max - speed);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void move(){
        System.out.println("Class Vehicle: vehicle moves");
    }

    final void stop(){
        System.out.println("Class Vehicle: vehicle stopped");
    }
}
