package CodingExercise;

public class e25LargestPrime {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(7));
    }

    public static int getLargestPrime(int number){
            if (number > 1) {
                for (int factorChecker = number-1 ; factorChecker > 2; factorChecker--) {
                    //checks factors from hightest to lowest
                    if (number % factorChecker == 0) {
                        //if it is a factor, it is set as the hightest prime temporarily and the new number to be tested.
                        //If no factor, no new number will be set. So it will return the entered number.
                        //if it still has a factor, it is not the largest prime. So the next factor will be set as the new largest prime.
                        number = factorChecker;
                    }
                }
                return number;
            }
            return -1;
    }
}
