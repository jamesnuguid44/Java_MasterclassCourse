package CodingExerciseSection1to5;

public class e15NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1234321));
    }

    public static boolean isPalindrome(int number){
        int reversedNum = 0;
        int numBeingReversed = number;
        int lastDigit;
        while(numBeingReversed!=0){
            if ((numBeingReversed<10 && numBeingReversed>=0)||( numBeingReversed>-10 && numBeingReversed<=0)){
                reversedNum += numBeingReversed;
                break;
            }
            lastDigit = numBeingReversed%10;
            reversedNum += lastDigit;
            reversedNum *=10;
            numBeingReversed /=10;

        }
        return (number==reversedNum);
    }
}
