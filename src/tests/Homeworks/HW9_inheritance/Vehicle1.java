package tests.HW9_inheritance;

public class Vehicle1 {

    int speed = 250;

    private String model = "truck";

    void speedUp(int value){
        speed += value;
    };

    void applyBrake(int value){
        speed -= value;
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
