package Basics;

public class C4CalculateInterest {
    public static void main(String[] args) {
        for (int interest = 2; interest < 9; interest++){
            System.out.println("10,000 at " + interest + "% interest is= "+ calculateInterest(10000,interest));
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount *(interestRate/100));
    }
}
