package Challenge.C1toC11;

public class C7DigitSum {
    public static void main(String[] args) {
        int number = 7373;
        System.out.println("The sum of the digits in number "+number+ " is "+sumDigits(number));
    }

    public static int sumDigits(int number){
        int extractedNum;
        int totalExtractedNum = 0;
        int newNum = number;
        if (number < 10){
            return -1;
        } else {
            while (newNum>0){
                //extract the last digit using modulo. The last number becomes a remainder.
                extractedNum = newNum%10;
                totalExtractedNum += extractedNum;
                //remove the last number by dividing it by 10. Remove one 0. Like multiplying by 10 adds one 0.
                newNum /= 10;
            }
        } return totalExtractedNum;
    }
}
