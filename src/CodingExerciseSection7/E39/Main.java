package CodingExerciseSection7.E39;

class Car {
    private String name;
    private boolean engine;
    private int cylinders;
    private int wheels;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public void startEngine(){
        System.out.println("Car engine started. 2 cylinders go vroom vroom.");
    }

    public void accelerate(){
        System.out.println("Car accelerating");
    }

    public void brake(){
        System.out.println("Car stopped");
    }
}

class Honda extends Car {

    public Honda() {
        super("Honda", 6);
    }

    @Override
    public void startEngine() {
        System.out.println("Honda engine started " + getCylinders() + " cylinders go vroom vroom");
    }

    @Override
    public void accelerate() {
        System.out.println("Honda accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Honda stopped.");
    }
}

class Mitsubishi extends Car{

    public Mitsubishi() {
        super("Mitsubishi", 8);
    }

    @Override
    public void startEngine() {
        System.out.println("Mitsubishi engine started " + getCylinders() + " cylinders go vroom vroom");
    }

    @Override
    public void accelerate() {
        System.out.println("Mitsubishi accelerating.");
    }

    @Override
    public void brake() {
        System.out.println("Mitsubishi stopped.");
    }
}

class Mercedez extends Car{

    public Mercedez() {
        super("Mercedez", 12);
    }
}

public class Main{
    public static void main(String[] args) {
        Car mitsubishi = new Mitsubishi();
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();
        System.out.println();

        Car mercedez = new Mercedez();
        mercedez.startEngine();
        mercedez.accelerate();
        mercedez.brake();
        System.out.println();

        Car honda = new Honda();
        honda.startEngine();
        honda.accelerate();
        honda.brake();
        System.out.println();
    }
}
