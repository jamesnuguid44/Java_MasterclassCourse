package CodingExercise;

public class e14SumOddRange {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 11));
        //System.out.println(isOdd(1));
    }

    public static boolean isOdd(int number) {
        if (number < 1) {
            return false;
        } else {
            return (number % 2 == 1);
        }
    }

    public static int sumOdd(int start, int end) {
        int summedOddNumbers = 0;
        if ((start < 1 || end < 1) || (end < start)) {
            return -1;
        } else {
            for (int startNum = start; startNum <= end; startNum++) {
                if (isOdd(startNum)) {
                    summedOddNumbers += startNum;
                    //System.out.println(startNum);
                }
            }
        }
        return summedOddNumbers;
    }
}
