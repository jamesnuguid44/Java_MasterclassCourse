package Challenge.C12;

public class Vehicle {

    private String placeOfOperation;
    private String engine;
    private int speed;

    public Vehicle(){
        this("Place not specified", "Engine not specified", 0);
    }

    public Vehicle(String placeOfOperation, String engine, int speed){
        this.placeOfOperation = placeOfOperation;
        this.engine = engine;
        this.speed = speed;
    }

    public void move(int speed){
        this.speed=speed;
        System.out.println("This vehicle is moving at " + this.speed + "km/h");
    }
}
