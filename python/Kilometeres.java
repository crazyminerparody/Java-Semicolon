import java.util.Scanner;
public class KMtoMiles{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter distance in kilometres: ");
    double kilometer = input.nextDouble();
    double miles = kilometers * 0.621371;
    System.out.printf("%2f kilometers is equal to %2f miles", kilometers, miles);
    }
}
