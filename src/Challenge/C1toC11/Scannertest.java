package Challenge.C1toC11;

import java.util.Scanner;

public class Scannertest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter int: ");
        int num = scanner.nextInt();
        System.out.println(num);
        //add scanner.nextLine so it will handle input and allow user to enter different data type after.
        scanner.nextLine();
        System.out.println("Please enter int again: ");
        num = scanner.nextInt();
        System.out.println(num);
        scanner.nextLine();
        //it will auto enter nothing and skip the last scanner if you dont put scanner.nextLine
        System.out.println("Please enter name: ");
        String name = scanner.nextLine();
        System.out.println(name);
    }
}
