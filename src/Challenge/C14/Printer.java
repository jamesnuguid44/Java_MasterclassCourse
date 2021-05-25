package Challenge.C14;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplexPrinter;

    public Printer(int tonerLevel, int pagesPrinted, boolean isDuplexPrinter) {
        if (tonerLevel<0) {
            this.tonerLevel = 0;
            System.out.println("Not enough toner");
        } else {
            this.tonerLevel = tonerLevel;
        }
        if (isDuplexPrinter == true) {
            this.pagesPrinted = pagesPrinted*2;
        } else {
            this.pagesPrinted = pagesPrinted;
        }
        this.isDuplexPrinter = isDuplexPrinter;
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }

    public void fillUpToner (int tonerLevel) {
        if (tonerLevel<0){
            System.out.println("Toner not filled. Insufficient toner.");
        } else {
            System.out.println("Toner level filled up by " + tonerLevel);
            this.tonerLevel += tonerLevel;
            System.out.println("Toner level is now: " + this.tonerLevel);
        }
    }

    public void printPages (int pagesPrinted) {
        if (pagesPrinted < 0){
            System.out.println("Invalid number of pages");
        } else {
            if (isDuplexPrinter) {
                System.out.println("Duplex printer printing pages now.");
                this.pagesPrinted += pagesPrinted * 2;
                System.out.println("Printed pages are now " + this.pagesPrinted);
            } else {
                System.out.println("Regular printer printing pages now.");
                this.pagesPrinted += pagesPrinted;
                System.out.println("Printed pages are now " + this.pagesPrinted);
            }
        }
    }
}
