package Challenge.C13;

public class LivingRoom {
    private Television television;
    private Fan fan;

    public LivingRoom(Television television, Fan fan) {
        this.television = television;
        this.fan = fan;
    }

    private Television getTelevision() {
        return television;
    }

    private Fan getFan() {
        return fan;
    }

    public void playShow(){
     television.play();
    }

    public void turnOnFan(int level){
        fan.turnOn(level);
    }

    public void adjustFanLevel(int level){
        fan.adjustLevel(level);
    }
}
