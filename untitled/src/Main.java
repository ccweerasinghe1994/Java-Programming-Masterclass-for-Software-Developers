public class Main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 500;
        int levelCompleted = 5;
        int bonus = 100;
        System.out.println("Your Final Score is: " + calculateScore(gameOver, score, levelCompleted, bonus));


        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        System.out.println("Your Final Score is: " + calculateScore(gameOver, score, levelCompleted, bonus));
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += bonus;
            return finalScore;
        }
        return -1;
    }
}