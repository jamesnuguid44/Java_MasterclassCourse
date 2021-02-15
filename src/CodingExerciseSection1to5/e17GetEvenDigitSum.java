package CodingExerciseSection1to5;

public class e17GetEvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2143652));
    }

    public static int getEvenDigitSum(int number){
        int lastDigit = 0;
        int updatedNumber = number;
        int evenTotal = 0;

        if (number<0){
            return -1;
        }

        while (updatedNumber>0){
            lastDigit = updatedNumber%10;
            if (lastDigit%2==0){
                evenTotal += lastDigit;
            }
            updatedNumber /=10;
        } return evenTotal;
    }
}
