package Challenge.C12;

import CodingExerciseSection6.E33.Calculator;

public class Car extends Vehicle{
    private int doors;
    private int wheels;

    public Car(){
        this(4,4);
    }

    public Car(int doors, int wheels){
        super("Land", "Volvo", 20);
        this.doors = doors;
        this.wheels = wheels;
    }

    public void changeGear(int gear){
        System.out.println("Changed gear to "+gear);
    }

    public void increaseSpeed(){
        System.out.println("Speed increased");
    }

    public void decreaseSpeed(){
        System.out.println("Speed decreased");
    }
}
