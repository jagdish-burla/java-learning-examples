public class MainChallenge {
    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 10000;
        int levelCompleted = 8;
        int bonus = 200;
        int finalScore = score;

        if (gameOver == true){
            //finalScore +=  (levelCompleted * bonus);
            //System.out.println("Your final score is :" + finalScore);
            printFinalScore(score, levelCompleted,bonus);
        }
    }
    public static void printFinalScore(int score, int levComp, int bonusearned){
        int finalScores = 0;
        finalScores += score + (levComp * bonusearned);
        System.out.println("Your final score is :" + finalScores);

    }
}
