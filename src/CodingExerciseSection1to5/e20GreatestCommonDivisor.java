package CodingExerciseSection1to5;

public class e20GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));
    }

    public static int getGreatestCommonDivisor(int first, int second){
        int greatestDivisor = 0;
        if (first<10 || second<10){
            return -1;
        }
        for (int divisorTester = 1; (divisorTester<first/2) || (divisorTester<second/2); divisorTester++){
            if ((first%divisorTester == 0) && (second%divisorTester == 0)){
                greatestDivisor = divisorTester;
            }
        } return greatestDivisor;
    }
}
