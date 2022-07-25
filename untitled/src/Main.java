public class Main {
    public static void main(String[] args) {
        String name = "chamara";

        int score = 1500;
        int position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        score = 900;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        score = 400;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

        score = 50;
        position = calculateHighScorePosition(score);
        displayHighScorePosition(name, position);

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " Manage to get position " + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000) {
            position = 1;
        } else if (score >= 500) {
            position = 2;
        } else if (score >= 100) {
            position = 3;
        }
        return position;

    }
}