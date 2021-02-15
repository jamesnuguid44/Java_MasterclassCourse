package CodingExerciseSection1to5;

public class e16FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
    }

    public static int sumFirstAndLastDigit(int number){
        if (number<0){
            return -1;
        }
        int firstNumber = 0;
        int lastNumber = number%10;

        for (int num = number; num>0;){
            if (num<10){
                firstNumber = num%10;
                break;
            }
            num /= 10;
        } return firstNumber+lastNumber;
    }
}
