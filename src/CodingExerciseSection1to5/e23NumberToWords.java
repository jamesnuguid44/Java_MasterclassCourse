package CodingExerciseSection1to5;

public class e23NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
        System.out.println(reverse(-981));
    }

    public static void numberToWords(int number){
        if (number<0){
            System.out.println("Invalid Value");
        }

        int lastDigit;
        int reversedNum = reverse(number);

        for (int numCount = 0; numCount<getDigitCount(number); numCount++){

            lastDigit = reversedNum%10;

            if (lastDigit==0){
                System.out.println("Zero");
            }
            else if (lastDigit==1){
                System.out.println("One");
            }
            else if (lastDigit==2){
                System.out.println("Two");
            }
            else if (lastDigit==3){
                System.out.println("Three");
            }
            else if (lastDigit==4){
                System.out.println("Four");
            }
            else if (lastDigit==5){
                System.out.println("Five");
            }
            else if (lastDigit==6){
                System.out.println("Six");
            }
            else if (lastDigit==7){
                System.out.println("Seven");
            }
            else if (lastDigit==8){
                System.out.println("Eight");
            }
            else if (lastDigit==9){
                System.out.println("Nine");
            }

            reversedNum /= 10;
        }
    }

    public static int reverse(int number){
        int reversedNum = 0;
        int lastDigit;
        int numBeingReversed = number;
        while (numBeingReversed!=0){
            if ((numBeingReversed<10 && numBeingReversed>=0)||( numBeingReversed>-10 && numBeingReversed<=0)){
                reversedNum += numBeingReversed;
                break;
            }
            lastDigit = numBeingReversed%10;
            reversedNum+=lastDigit;
            reversedNum*=10;
            numBeingReversed/=10;
        }
        return reversedNum;
    }

    public static int getDigitCount(int number){
        int digitCount = 0;
        int newNum;

        if (number<0){
            return -1;
        }
        do {
            digitCount++;
            newNum = number/=10;
        } while (newNum>0 );

        return digitCount;
    }
}
