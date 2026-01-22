import java.util.Scanner;
import java.util.Arrays;
public class TaskThree3 {
    public static void main(String...args) {
        Scanner inputCollector = new Scanner(System.in);

        int[] numbers= new int[10];

        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Enter a number " + (index + 1));
            number[index] = inputCollector.nextInt();
        }

        System.out.println("Numbers in the array:");
        for (int number : Numbers) {
            System.out.print(number);
        }
    }
}
