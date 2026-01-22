import java.util.Random;
import java.util.Scanner;

public class TaskFour{
    public static void main(String...args) {
        Random rand = new Random();
        Scanner inputCollector = new Scanner(System.in);

        int number = random.nextInt(1, 11);
        int guess;

        System.out.print("Guess a number between 1 and 10: ");
        guess = inputCollector.nextInt();

        while (guess != number) {
            if (guess > number) {
                System.out.println("Too high!");
            } else {
                System.out.println("Too low!");
            }

            System.out.println("Please Try again: ");
            guess = inputCollector.nextInt();
        }

        System.out.println("You're correct!");
    }
}
