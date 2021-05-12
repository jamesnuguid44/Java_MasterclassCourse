package Challenge.C1toC11;

public class C1CalculateHighScorePosition {
    public static void main(String[] args) {
        int position1 = calculateHighScorePosition(1500);
        displayHighScorePosition("James", position1);
        displayHighScorePosition("Jack", calculateHighScorePosition(900));
        displayHighScorePosition("Peter", calculateHighScorePosition(400));
        displayHighScorePosition("John", calculateHighScorePosition(50));

    }

    public static void displayHighScorePosition(String player, int position){
        System.out.println(player + " managed to get into position " +
                position + " on the highscore table.");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000){
            return 1;
        }
        else if (playerScore >= 500){
            return 2;
        }
        else if (playerScore >= 100){
            return 3;
        }
        else {
            return 4;
        }
    }
}
