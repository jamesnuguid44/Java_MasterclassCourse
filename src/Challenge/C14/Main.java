package Challenge.C14;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(100, 20, false);
        printer.printPages(-1);
        printer.fillUpToner(-2);
        System.out.println();
        printer.fillUpToner(100);
        printer.printPages(50);
    }
}
