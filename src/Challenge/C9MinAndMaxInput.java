package Challenge;
import java.util.Scanner;

public class C9MinAndMaxInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minInput = 0;
        int maxInput = 0;
        int lastInput;

        while (true){
            System.out.print("Enter Integer: ");
            lastInput = scanner.nextInt();
            if (lastInput < 0){
                System.out.println("Minimum Number is: " + minInput);
                System.out.println("Maximum Number is: " + maxInput);
                break;
            }

            if ((minInput == 0) && (maxInput == 0)){
                maxInput = lastInput;
                minInput = lastInput;
            } else if (lastInput>maxInput){
                maxInput = lastInput;
            } else if (lastInput<minInput){
                minInput = lastInput;
            }

        }

    }
}
