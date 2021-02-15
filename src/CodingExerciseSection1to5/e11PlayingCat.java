package CodingExerciseSection1to5;

public class e11PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if (summer && (temperature>24 && temperature<46)){
            return true;
        } else if (temperature>24 && temperature<36){
            return true;
        }
            return false;

    }
}
