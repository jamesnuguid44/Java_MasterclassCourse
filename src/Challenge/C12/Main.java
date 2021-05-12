package Challenge.C12;

public class Main {
    public static void main(String[] args) {
        Mazda3 newMazda3 = new Mazda3("Carbon","Carbon", "Volks");
        System.out.println("New Mazda with " + newMazda3.getSpoiler() + " spoiler, " + newMazda3.getHood() + " hood, and " +
                        newMazda3.getMags() + " mags");
        newMazda3.move(50);
        newMazda3.changeGear(6);
        newMazda3.increaseSpeed();
        newMazda3.turbo(65);
    }
}
