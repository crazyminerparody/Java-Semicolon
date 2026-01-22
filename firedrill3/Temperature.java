import java.util.Scanner;
public class Temperature{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter temperature in Kelvin: ");
    double kelvin = Scanner.nextDouble();
    double celsius = k- 273.15;
    double fahrenheit = (k - 273.15)*9/5+32;
    System.out.println("Temperature in Kelvin: " + kelvin);
    System.out.println("Temperature in Celsius: " + celsius);
    System.out.println("TEmmperature in Fahrenheit" + fahrenheit); 
    }
}
