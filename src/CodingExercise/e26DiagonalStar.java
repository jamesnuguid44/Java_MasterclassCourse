package CodingExercise;

public class e26DiagonalStar {
    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number) {
        int rowNumber;
        int columnNumber;
        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (rowNumber = 1; rowNumber <= number; rowNumber++) {
                for (columnNumber = 1; columnNumber <= number; columnNumber++) {
                    if (columnNumber == number) {
                        System.out.print("*");
                        System.out.println();
                        continue;
                    }
                    if (rowNumber == 1 || rowNumber == number || columnNumber == 1 ||
                            (rowNumber == columnNumber) || columnNumber == ((number - rowNumber) + 1)) {
                        System.out.print("*");
                        //continue;
                    } else {
                        System.out.print(" ");
                        //continue;
                    }
                }
            }
        }
    }
}
