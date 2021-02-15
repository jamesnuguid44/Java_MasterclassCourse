package CodingExerciseSection1to5;

public class e2MegaBytesConverter {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-123);
        printMegaBytesAndKiloBytes(7240);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        } else {
            System.out.println(kiloBytes + " KB = " + (kiloBytes / 1024) + " MB and " +
                    (kiloBytes % 1024) + " KB");
        }
    }
}
