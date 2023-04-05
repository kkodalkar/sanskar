import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNumber = random.nextInt(100);
            System.out.println("Random number #" + (i + 1) + ": " + randomNumber);
        }
    }
}
