import java.util.Scanner;
import java.util.Arrays;
public class TaskOne {
    public static void main(Stringargs) {
        Scanner inputCollector = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Enter a number " + (index + 1));
            number[index] = inputCollector.nextInt();
        }

        System.out.println("Numbers in the array:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
