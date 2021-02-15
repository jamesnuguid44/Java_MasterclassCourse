package CodingExerciseSection1to5;

public class e7TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(17,9,71));
        System.out.println(isTeen(70));
    }

    public static boolean hasTeen(int kid1, int kid2, int kid3){
        return (kid1 >= 13 && kid1 <= 19) || (kid2 >= 13 && kid2 <= 19) || (kid3 >= 13 && kid3 <= 19);
    }

    public static boolean isTeen(int kid1){
        return (kid1 >= 13 && kid1 <=19);
    }
}
