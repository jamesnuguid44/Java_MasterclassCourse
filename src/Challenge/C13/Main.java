package Challenge.C13;

public class Main {
    public static void main(String[] args) {
        Show show = new Show("Kingdom", 3);
        Television television = new Television(4, show);
        Fan fan = new Fan("Hanabishi");

        LivingRoom livingRoom = new LivingRoom(television,fan);
//        livingRoom.getTelevision().play();
//        System.out.println(livingRoom.getFan().getBrand() +" Fan at level " + livingRoom.getFan().getLevel());
//        livingRoom.getFan().turnOn(3);
//        livingRoom.getFan().adjustLevel(4);

        livingRoom.playShow();
        livingRoom.turnOnFan(2);
        livingRoom.adjustFanLevel(4);
    }
}
