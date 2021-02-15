package CodingExerciseSection1to5;

public class e4LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(1924));
    }

    public static boolean isLeapYear(int year){

        boolean isBy4 = (year%4)==0;
        boolean isBy100 = (year%100)==0;
        boolean isBy400 = (year%400)==0;

        if (year < 1 || year > 9999){
            return false;
        } else if (!isBy4){
            return false;
        } else if (isBy4){
            if (!isBy100){
                return true;
            } else if (isBy100){
                return isBy400;
            }
        }
        return false;
    }
}
