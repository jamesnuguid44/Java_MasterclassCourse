package CodingExercise;

public class e5DecimalComparator {
    public static void main(String[] args) {
        //areEqualByThreeDecimalPlaces(345.32123,367.175);
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int int1 = (int) (num1*1000);
        int int2 = (int) (num2*1000);
        if (int1==int2){
            return true;
        } else {
            return false;
        }
    }
}
