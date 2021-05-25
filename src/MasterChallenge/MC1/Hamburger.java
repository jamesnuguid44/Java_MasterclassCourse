package MasterChallenge.MC1;

public class Hamburger {
    private String breadRoll;
    private Meat meat;
    private Carrot carrot;
    private Lettuce lettuce;
    private Tomato tomato;
    private Sauce sauce;
    private int addOns = 0;
    private String addOnDetails = "All add-ons:";
    private int totalPrice = 200;

    public Hamburger(String breadRoll, Meat meat) {
        this.breadRoll = breadRoll;
        this.meat = meat;
        //System.out.println(getClass().getSimpleName() + " ordered");
        getInitialBurgerDetails();
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public Meat getMeat() {
        return meat;
    }

    public Carrot getCarrot() {
        return carrot;
    }

    public Lettuce getLettuce() {
        return lettuce;
    }

    public Tomato getTomato() {
        return tomato;
    }

    public Sauce getSauce() {
        return sauce;
    }

    public int getAddOns() {
        return addOns;
    }

    public int getTotalPrice() {
        return totalPrice;
    }



    public void getInitialBurgerDetails(){
        System.out.println("Customer ordered a " + getClass().getSimpleName() + " with "
                + getBreadRoll() + " and " +
                meat.getMeat() + ".");
    }

    public void getInitialTotalPrice(){
        System.out.println("Total price is: " + totalPrice);
    }

    public void addCarrot(Carrot carrot){
        this.carrot = carrot;
        System.out.println(this.carrot.getCarrot() + " added.");
        totalPrice += 10;
        addOns += 1;
        addOnDetails += ("\n" + this.carrot.getCarrot() + "= 10");
        System.out.println("Total price is now: "+totalPrice + " with " + addOns + " add-on(s).");
    }

    public void addLettuce(Lettuce lettuce){
        this.lettuce = lettuce;
        System.out.println(this.lettuce.getLettuce() + " added.");
        totalPrice += 10;
        addOns += 1;
        addOnDetails += ("\n" + this.lettuce.getLettuce() + "= 10");
        System.out.println("Total price is now: "+totalPrice + " with " + addOns + " add-on(s).");
    }

    public void addTomato(Tomato tomato){
        this.tomato = tomato;
        System.out.println(this.tomato.getTomato() + " added.");
        totalPrice += 10;
        addOns += 1;
        addOnDetails += ("\n" + this.tomato.getTomato() + "= 10");
        System.out.println("Total price is now: "+totalPrice + " with " + addOns + " add-on(s).");
    }

    public void addSauce(Sauce sauce){
        this.sauce = sauce;
        System.out.println(this.sauce.getSauce() + " added.");
        totalPrice += 10;
        addOns += 1;
        addOnDetails += ("\n" + this.sauce.getSauce() + "= 10");
        System.out.println("Total price is now: "+totalPrice + " with " + addOns + " add-on(s).");
    }

    public void add(String add){
        System.out.println(add + " added.");
        totalPrice += 10;
        addOns += 1;
        addOnDetails += ("\n" + add + "= 10");
        System.out.println("Total price is now: "+totalPrice + " with " + addOns + " add-on(s).");
    }

    public void getAddOnDetails(){
        System.out.println(addOnDetails);
    }

    public void getBurgerDetailsAndPrice(){
        System.out.println("Burger base price: 200");
        System.out.println(addOnDetails);
        System.out.println("Total price: " + totalPrice);
    }
}
