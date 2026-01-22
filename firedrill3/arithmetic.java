import java.util.Scanner;
public class Arithmetic{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter first integer: ");
    int firstnumber = input.nextInt();
    System.out.print("Enter second integer: ");
    int secondnumber = input.nextInt();
    int firstsquare = firstnumber * firstnumber;
    int secondsquare = secondnumber * secondnumber;
    int sumofbothSquares = firstnumber * secondnumber;
    int differenceofTwoSquares = firstsquare - secondsquare;
    System.out.printf("Square of %d is %d%n", firstnumber, firstsquare);
    System.out.printf("Square of %d is %d%n", secondnumber, secondsquare);
    System.out.printf("Sum of both squares is %d%n", sumofbothSquares);
    System.out.printf("Difference of two Squares of %d%n", differenceofTwoSquares);
    }   
}
