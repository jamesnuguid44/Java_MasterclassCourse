package CodingExerciseSection1to5;

public class e3BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp(true, 23));
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if(hourOfDay > 23 || hourOfDay < 0) {
            return false;
        } else if (barking && (hourOfDay < 8 || hourOfDay > 22)){
            return true;
        } else {
            return false;
        }
    }
}
