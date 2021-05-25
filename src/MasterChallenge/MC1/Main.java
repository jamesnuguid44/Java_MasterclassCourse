package MasterChallenge.MC1;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat("beef patty");
        Hamburger hamburger = new Hamburger("whole wheat bread", meat);
        hamburger.getInitialTotalPrice();
        Sauce sauce = new Sauce("Barbecue sauce");
        hamburger.addSauce(sauce);
        Lettuce lettuce = new Lettuce("Rotten lettuce");
        hamburger.addLettuce(lettuce);
        hamburger.getAddOnDetails();
        hamburger.getBurgerDetailsAndPrice();

        System.out.println();

        Meat meat1 = new Meat("chicken patty");
        HealthyBurger healthyBurger = new HealthyBurger("brioche", meat1);
        healthyBurger.getInitialTotalPrice();
        Sauce mustard = new Sauce("mustard");
        healthyBurger.addSauce(mustard);
        healthyBurger.addPickles("fresh pickles");
        healthyBurger.addPepper("ground pepper");
        healthyBurger.getAddOnDetails();
        healthyBurger.getBurgerDetailsAndPrice();

        System.out.println();

        Meat meat2 = new Meat("pure beef");
        DeluxeBurger deluxeBurger = new DeluxeBurger("premium white buns",meat2,"potato chips","sarsi");
        deluxeBurger.getInitialTotalPrice();
        Lettuce lettuce1 = new Lettuce("new lettuce");
        deluxeBurger.addLettuce(lettuce1);
        deluxeBurger.getAddOnDetails();
        deluxeBurger.getBurgerDetailsAndPrice();
    }
}
