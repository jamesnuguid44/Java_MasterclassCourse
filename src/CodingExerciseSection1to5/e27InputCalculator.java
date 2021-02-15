package CodingExerciseSection1to5;

import java.util.Scanner;

public class e27InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double intCount = 0;
        double average;
        int lastInt;

        while (true){
            boolean isInt = scanner.hasNextInt();
            if (isInt){
                lastInt = scanner.nextInt();
                sum += lastInt;
                intCount++;
                scanner.nextLine();
            } else {
                average = sum/intCount;
                System.out.println("SUM = "+ (int) sum + " AVG = "+ Math.round(average));
                break;
            }
        }
    }
}
