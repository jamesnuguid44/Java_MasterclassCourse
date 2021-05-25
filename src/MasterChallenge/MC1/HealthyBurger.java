package MasterChallenge.MC1;

public class HealthyBurger extends Hamburger{
    private String pickles;
    private String pepper;
    private int addOns = 0;
    private int totalPrice;

    public HealthyBurger(String breadRoll, Meat meat) {
        super(breadRoll, meat);
    }

    public String getPickles() {
        return pickles;
    }

    public String getPepper() {
        return pepper;
    }

    public void addPickles(String pickles){
        this.pickles = pickles;
        add(pickles);
    }

    public void addPepper(String pepper){
        this.pepper = pepper;
        add(pepper);
    }
}
