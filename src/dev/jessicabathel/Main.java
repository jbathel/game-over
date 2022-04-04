package dev.jessicabathel;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        // Create a method called displayHighScorePosition
        // it should a players name as a parameter, and a 2nd parameter as a position in the high score table
        // You should display the players name along with a message like " managed to get into position " and the
        // position they got and a further message " on the high score table".
        //
        // Create a 2nd method called calculateHighScorePosition
        // it should be sent one argument only, the player score
        // it should return an in
        // the return data should be
        // 1 if the score is >=1000
        // 2 if the score is >=500 and < 1000
        // 3 if the score is >=100 and < 500
        // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Charles", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Jessica", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Kaylee", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Katherine", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Kristoff", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Anna", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Blue", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position " + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
        int position = 4;

        if(playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }
        return position;
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (!gameOver) {
            return -1;
        } else {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
    }
}
