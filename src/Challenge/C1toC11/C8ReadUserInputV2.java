package Challenge.C1toC11;
import java.util.Scanner;

public class C8ReadUserInputV2 {
    public static void main(String[] args) {
        int totalNum = 0;
        Scanner scanner = new Scanner(System.in);

        for (int num = 1; num <=10; ){
            System.out.print("Enter integer #" + num + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt){
                int enteredNum = scanner.nextInt();
                totalNum += enteredNum;
                num++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }

        System.out.println("The total of all integers is: "+totalNum);
    }
}
