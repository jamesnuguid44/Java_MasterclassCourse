package Basics;

public class C4IsPrimeNumber {
    public static void main(String[] args) {
        int count = 0;
        for (int num=10; num<50; num++){
            if (isPrime(num)){
                count++;
                System.out.println("Number "+num+ " is prime.");
            }
            if (count==7){
                System.out.println("Exiting");
                break;
            }
        }
    }

    public static boolean isPrime(int n){

        if (n==1){
            return false;
        }
        //n/2 because if you divide the n to it's half, it shouldn't also be divided evenly.
        for (int i=2; i <= n/2; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
