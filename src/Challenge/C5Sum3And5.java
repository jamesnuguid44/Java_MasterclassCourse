package Challenge;

public class C5Sum3And5 {
    public static void main(String[] args) {
        int summedNumbers = 0;
        int summedCount = 0;
        for (int num=1; num <= 1000; num++){
            if (num%3==0 && num%5==0){
                summedCount++;
                summedNumbers += num;
                System.out.println("Number "+num+" is divisible by 3 and 5.");
            }
            if (summedCount==5){
                System.out.println("Summed amount is "+summedNumbers);
                break;
            }
        }
    }
}
