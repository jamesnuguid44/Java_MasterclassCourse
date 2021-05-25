package CodingExerciseSection7.E38;

public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean  duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if (tonerLevel < 0 || tonerLevel > 100) {
            this.tonerLevel = -1;
        } else{
            this.tonerLevel = tonerLevel;
        }
        this.duplex = duplex;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

    public int addToner(int tonerAmount) {
        if (tonerAmount > 100 || tonerAmount < 1){
            return -1;
        } else {
            if ((tonerLevel+tonerAmount)>100 || (tonerLevel+tonerAmount)<1 ){
                return -1;
            } else {
                tonerLevel = tonerLevel+tonerAmount;
                return tonerLevel;
            }
        }
    }

    public int printPages(int pages) {
        int pagesToPrint = pages;
        if (duplex){
            pagesToPrint = ((pagesToPrint/2) + (pagesToPrint%2));
            this.pagesPrinted += pagesToPrint;
            return pagesToPrint;
        }
        this.pagesPrinted += pagesToPrint;
        return pagesToPrint;
    }
}
