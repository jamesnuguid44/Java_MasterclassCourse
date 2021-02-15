package CodingExerciseSection1to5;

public class e21FactorPrinter {
    public static void main(String[] args) {
        printFactors(6);
    }

    public static void printFactors(int number){

        if (number<1){
            System.out.println("Invalid Value");
        }

        for (int factorChecker = 1; factorChecker<=number; factorChecker++){
            if (number%factorChecker==0){
                System.out.println(factorChecker);
            }
        }
    }
}
