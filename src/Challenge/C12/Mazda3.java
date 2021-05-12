package Challenge.C12;

public class Mazda3 extends Car{
    private String spoiler;
    private String hood;
    private String mags;

    public Mazda3(){
        this("none", "Stock", "Stock");
    }

    public Mazda3(String spoiler, String hood, String mags){
        super(2,4 );
        this.spoiler = spoiler;
        this.hood = hood;
        this.mags = mags;
    }

    public void turbo(int speed){
        System.out.println("Turbo boost of "+speed);
    }

    public String getSpoiler() {
        return spoiler;
    }

    public String getHood() {
        return hood;
    }

    public String getMags() {
        return mags;
    }
}
