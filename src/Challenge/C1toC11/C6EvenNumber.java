package Challenge.C1toC11;

public class C6EvenNumber {
    public static void main(String[] args) {
        int number = 4;
        int finishNumber = 20;
        int evenCount = 0;

        while (number <= finishNumber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            System.out.println(number+ " is an even number");
            evenCount++;

            if (evenCount==5){
                break;
            }

        }
    }

    public static boolean isEvenNumber(int number){
        return (number%2==0);
    }
}
