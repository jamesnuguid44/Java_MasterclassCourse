package Challenge.C1toC11;
import java.util.Scanner;

public class C8ReadUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int digitCount = 0;
        int numBeingAsked = 1;
        int sumOfIntegers = 0;
        int enteredNum;

        while (digitCount<10){
            System.out.print("Enter Integer #" + numBeingAsked + ": ");
            boolean hasNextInt = scanner.hasNextInt();
                if (hasNextInt){
                    enteredNum = scanner.nextInt();
                    sumOfIntegers += enteredNum;
                    digitCount++;
                    numBeingAsked++;
                } else {
                    System.out.println("Invalid Number");
                }
            scanner.nextLine();
        }
        System.out.println("The Sum of the Integers: "+sumOfIntegers);
    }
}
