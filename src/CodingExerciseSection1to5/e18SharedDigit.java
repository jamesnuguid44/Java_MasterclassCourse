package CodingExerciseSection1to5;

public class e18SharedDigit {
    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12, 33));
    }

    public static boolean hasSharedDigit(int num1, int num2){
        int digitOneFirst;
        int digitOneSecond;
        int digitTwoFirst;
        int digitTwoSecond;
        int number1 = num1;
        int number2 = num2;

        if ((num1<10 || num1>99) || (num2<10 || num2>99)){
            return false;
        }

        digitOneSecond = number1%10;
        number1 /=10;
        digitOneFirst = number1%10;

        digitTwoSecond = number2%10;
        number2 /=10;
        digitTwoFirst = number2%10;

        return ((digitOneFirst == digitTwoFirst || digitOneFirst == digitTwoSecond) ||
                (digitOneSecond == digitTwoFirst || digitOneSecond == digitTwoSecond));
    }
}
