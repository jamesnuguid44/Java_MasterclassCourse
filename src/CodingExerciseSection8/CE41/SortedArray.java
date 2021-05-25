package CodingExerciseSection8.CE41;

import java.util.Scanner;

public class SortedArray {
    public static void main(String[] args) {
//        int[] saasas = new int[6];
//        System.out.println("sas length is "+ saasas.length);
        int[] array = getInteger(10);
        printArray(array);
        array=sortIntegers(array);
        printArray(array);
    }

    public static int[] getInteger(int intCount){
        int[] arrayInput = new int[intCount];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + intCount + " integers");

        for (int i = 0; i<arrayInput.length; i++){
            System.out.print("Please input int number " + (i+1) + ": ");
            arrayInput[i] = scanner.nextInt();
        }
        return arrayInput;
    }

    public static void printArray(int[] array){
        for (int i = 0; i<array.length; i++){
            System.out.println("Element "+ i + " contents "+array[i]);
        }
    }

    public static int[] sortIntegers(int[] array){
        int[] sortedInt = new int[array.length];
        System.out.println(array.length);
        System.out.println(sortedInt.length);
        for (int i = 0; i<sortedInt.length;i++){
            sortedInt[i]= array[i];
        }
        boolean areNumbersInOrder = false;

        while (!areNumbersInOrder){
            areNumbersInOrder = true;
            int temp;

            for (int i = 0; i<(sortedInt.length-1); i++){
                if (sortedInt[i]< sortedInt[i+1]){
                    temp = sortedInt[i];
                    sortedInt[i] = sortedInt[i+1];
                    sortedInt[i+1]=temp;
                    areNumbersInOrder =false;
                }
            }
        }
        return sortedInt;
    }

}
