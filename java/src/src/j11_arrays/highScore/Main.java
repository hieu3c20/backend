package j11_arrays.highScore;

public class Main {
    public static void main(String[] args) {
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(),
                        randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};

        int highScore = 0;
        int seat = 0;

        System.out.println("here are your score: ");
        for (int i = 0; i < scores.length; i++) {
            System.out.print(scores[i] + " ");
            if (scores[i] > highScore) {
                highScore = scores[i];
                seat = i;
            }
        }
        System.out.println("\nthe high score is: " + highScore + ". So impressive ! :D");
        System.out.println("That is gentleman in seat: " + seat + ". Give him a present");
    }

    public static int randomNumber() {
        double randomDouble = Math.random() * 1000 + 1;
        return (int) randomDouble;
    }

}
