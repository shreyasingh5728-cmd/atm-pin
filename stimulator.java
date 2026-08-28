public class stimulator {

    static void simulateLogin(String correctCode, String[] attempts) {

        boolean success = false;

        for (int i = 0; i < attempts.length && i < 3; i++) {

            if (attempts[i].equals(correctCode)) {
                System.out.println("Access granted on attempt " + (i + 1));
                success = true;
                break;
            }
        }

        if (!success) {
            System.out.println("Access denied - all attempts used");
        }
    }

    public static void main(String[] args) {

        String correctCode = "1234";

        String[] attempts = {"0000", "1234", "9999"};

        simulateLogin(correctCode, attempts);
    }
}