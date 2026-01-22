import java.util.Scanner;

public class TaskFour{
    public static void main(String[] args) {
        Scanner inputCollector = new Scanner(System.in);

        int numbers[] = new int[10];

        for (int index = 0; index < numbers.length; index++) {
            System.out.print("Enter number " + (index + 1) + ":");
            numbers[index] = inputCollector.nextInt();
        }

        System.out.println("Numbers in the array:");
        for (int Number : Numbers) {
            System.out.print(Number);


        }
    }
}
