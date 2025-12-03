import java.util.Scanner;
public class Area{
    public static void main(String[]args){
    Scanner guddy = new Scanner(System.in);

    System.out.print("Enter length: ");
    double length = guddy.nextDouble();
    System.out.print("Enter width: ");
    double width = guddy.nextDouble();
    double area = length * width;
    System.out.printf("Your Area is %f%n", area);
    }
}
