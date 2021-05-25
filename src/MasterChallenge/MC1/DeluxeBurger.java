package MasterChallenge.MC1;

public class DeluxeBurger extends Hamburger{
    private String chips;
    private String drink;
    private String addOnDetails = "All add-ons:";
    private int totalPrice = 300;


    public DeluxeBurger(String breadRoll, Meat meat, String chips, String drink) {
        super(breadRoll, meat);
        this.chips = chips;
        addOnDetails += "\n" + chips + " = 50";
        this.drink = drink;
        addOnDetails += "\n" + drink + " = 50";
    }

    @Override
    public int getAddOns() {
        return 0;
    }

    @Override
    public void addCarrot(Carrot carrot) {
        System.out.println("Additions not allowed");
    }

    @Override
    public void addLettuce(Lettuce lettuce) {
        System.out.println("Additions not allowed");
    }

    @Override
    public void addTomato(Tomato tomato) {
        System.out.println("Additions not allowed");
    }

    @Override
    public void addSauce(Sauce sauce) {
        System.out.println("Additions not allowed");
    }

    @Override
    public void add(String add) {
        System.out.println("Additions not allowed");
    }

    @Override
    public void getInitialTotalPrice() {
        System.out.println("Total price is: " + totalPrice);
    }

    @Override
    public void getAddOnDetails() {
        System.out.println(addOnDetails);
    }

    @Override
    public void getBurgerDetailsAndPrice() {
        System.out.println("Burger base price: 200");
        System.out.println(addOnDetails);
        System.out.println("Total price: " + totalPrice);
    }
}
