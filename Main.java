public class Main {

    // Method to check ATM PIN attempts
    static void atmPinRetry(String correctPin, String[] attempts) {

        int attempt = 0;
        boolean success = false;

        // Maximum 3 attempts and stop if PIN is accepted
        while (attempt < 3 && attempt < attempts.length && !success) {

            // Compare current attempt with correct PIN
            boolean pinMatches = attempts[attempt].equals(correctPin);

            if (pinMatches) {
                success = true;
                System.out.println("PIN accepted");
                break; // Stop immediately after successful attempt
            }

            attempt++;
        }

        // If PIN was never entered correctly
        if (!success) {
            System.out.println("Card blocked — too many incorrect attempts");
        }
    }

    public static void main(String[] args) {

        String correctPin = "4821";

        String[] attempts = {"1111", "4821"};

        atmPinRetry(correctPin, attempts);
    }
}