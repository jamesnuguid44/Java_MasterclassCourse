package Challenge.C15;
import java.util.Scanner;

public class MinimumElement {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numArray = readIntegers(10);
        int minValue = findMin(numArray);
        System.out.println("Minumum value is "+ minValue);
    }

    public static int[] readIntegers(int count){
        int[] array = new int[count];
        boolean isInt;
        for (int i = 0; i < array.length; i++){
            System.out.print("Int no. " + i + ": ");
            isInt = scanner.hasNextInt();
            if(isInt) {
                array[i] = scanner.nextInt();
                scanner.nextLine();
            } else {
                System.out.println("not a number");
                scanner.nextLine();
                i--;
            }
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int i=1; i<array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
