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
        if (score >= 1000) {
            return 1;
        } else if (score >= 500 && score < 1000) {
            return 2;
        } else if (score >= 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}