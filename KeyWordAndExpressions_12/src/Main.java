public class Main {

    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);
        add(1, 2);
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was: " + finalScore);
        }
    }

    public static int add (int a, int b) {
        if(a>b){
        return a + b;
        } else {
            return b - a;
        }
    }
}
