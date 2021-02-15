package CodingExerciseSection1to5;

public class e22PerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }

    public static boolean isPerfectNumber(int number){
        int properDivisorSum = 0;
        if (number<1){
            return false;
        }

        for (int factorChecker = 1; factorChecker<=(number/2); factorChecker++){
            if (number%factorChecker==0){
                properDivisorSum+=factorChecker;
            }
        }

        return (properDivisorSum == number);
    }
}
