import java.util.Scanner;

public class Firsttask{

    public static void main(String...args){

    Scanner inputCollector = new Scanner(System.in);

    int square = 0;
    int sum = 0;

    System.out.println("Enter an integer input: ");
    int number = inputCollector.nextInt();

    String num1 = "" + number; 

        for(int count = 0; count < num1.length(); count++){
            int digits = num1.charAt(count) - '0';
            
            square = digits * digits;

            sum += square;
}
    System.out.println(sum + " is the sum of the square of each digit");
}
}
