package CodingExerciseSection8.CE43;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = getElements(getInteger());
        printArray(array);
        reverse(array);
    }

    private static int getInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many values to enter? ");
        return scanner.nextInt();
    }

    private static int[] getElements(int count){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];

        for (int i=0; i<array.length; i++){
            System.out.print("Enter element " +i+ ": ");
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    //import Arrays class first if no auto import
    private static void reverse(int[] array){
        System.out.println("Array = " + Arrays.toString(array));
        int[] reversed = new int[array.length];

        for (int i=0, r=reversed.length-1; i<reversed.length; i++, r--){
            reversed[i] = array[r];
        }
        array = reversed;
        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    private static void printArray(int[] array){
        System.out.println("These are the array contents:");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
