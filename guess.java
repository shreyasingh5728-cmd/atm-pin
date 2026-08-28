public class guess {
    static void guessTheNumber(int secretNumber, int maxTries, int[] guesses) {

        int attempt = 0;
        boolean guessedCorrectly = false;

        while (attempt < maxTries && attempt < guesses.length && !guessedCorrectly) {

            int guess = guesses[attempt];

            if (guess > secretNumber) {
                System.out.println("Too high");
            } 
            else if (guess < secretNumber) {
                System.out.println("Too low");
            } 
            else {
                System.out.println("Correct! You guessed it");
                guessedCorrectly = true;
                break;
            }

            attempt++;
        }

        if (!guessedCorrectly) {
            System.out.println("Out of tries - the number was " + secretNumber);
        }
    }

    public static void main(String[] args) {

        int secretNumber = 7;
        int maxTries = 3;

        int[] guesses = {10, 5, 7};

        guessTheNumber(secretNumber, maxTries, guesses);
    }
}