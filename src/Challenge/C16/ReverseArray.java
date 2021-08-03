package Challenge.C16;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = getElements(getInteger());
        printArray(array);
        int[] reversedArray = reverse(array);
        printArray(reversedArray);
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

    private static int[] reverse(int[] array){
        int[] reversed = new int[array.length];

        for (int i=0, r=reversed.length-1; i<reversed.length; i++, r--){
                reversed[i] = array[r];
        }
        return reversed;
    }

    private static void printArray(int[] array){
        System.out.println("These are the array contents:");
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
