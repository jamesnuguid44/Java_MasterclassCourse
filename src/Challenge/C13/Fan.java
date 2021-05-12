package Challenge.C13;

public class Fan {
    private int level;
    private String brand;

    public Fan(String brand) {
        this.level=0;
        this.brand = brand;
    }

    public int getLevel() {
        return level;
    }

    public String getBrand() {
        return brand;
    }

    public void turnOn(int level){
        this.level = level;
        System.out.println("Fan turned on to level "+this.level);
    }

    public void adjustLevel(int level){
        this.level = level;
        System.out.println("Fan adjusted to level "+ this.level);
    }
}
