import java.text.NumberFormat;
import java.util.Scanner;
public class MortgageCalculator{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Input the principal amount(loan amount): ");
        double principal = inputCollector.nextDouble();

        System.out.print("Input the annual interest rate: ");
        double annualInterestRate = inputCollector.nextDouble();

        System.out.print("Input the duration of loan in years: ");
        int years = inputCollector.nextInt();

        double rate = (annualInterestRate / 100)/ 12;
        int duration = years * 12;

        double mortgage = 100000 * (0.005 * Math.pow(1 + 0.005, 180)) / (Math.pow(1 + 0.005, 180 - 1));

        System.out.printf("Your monthly payment is: %.2f\n", mortgage);

        

        











    }
}
