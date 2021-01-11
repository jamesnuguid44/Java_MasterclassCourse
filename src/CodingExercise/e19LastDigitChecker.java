package CodingExercise;

public class e19LastDigitChecker {
    public static void main(String[] args) {

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        int num1LastDigit;
        int num2LastDigit;
        int num3LastDigit;

        if ((!isValid(num1)) || (!isValid(num2)) || (!isValid(num3))){
            return false;
        }

        num1LastDigit = num1%10;
        num2LastDigit = num2%10;
        num3LastDigit = num3%10;

        return (num1LastDigit == num2LastDigit || num1LastDigit == num3LastDigit || num2LastDigit == num3LastDigit);
    }

    public static boolean isValid(int num){
        return (num >= 10 && num <= 1000);
    }
}
