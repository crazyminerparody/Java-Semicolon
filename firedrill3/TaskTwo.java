import java.util.Scanner;
import java.util.Arrays;
public class TaskTwo{
    public static void main(String...args) {
        Scanner inputCollector = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Enter a number: " + (index + 1) + ": ");
            number[index] = inputCollector.nextInt();
        }

        System.out.println("numbers in the array:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
