package CodingExerciseSection8.CE42;

import java.util.Scanner;

public class MinimumElement {

    public static void main(String[] args) {
        int[] array = readElements(readInteger());
        int min = findMin(array);
        System.out.println("Minimum value is "+min);
    }

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("How many int values do you need? ");
        num = scanner.nextInt();
        scanner.nextLine();
        return num;
    }

    private static int[] readElements(int count){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];

        for (int i=0; i<array.length; i++){
            System.out.print("Please enter value " +i+ ": ");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for (int i=1; i<array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
