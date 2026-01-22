import java.util.Scanner;
public class Eligibility{
    public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Annual Incomne: ");
    int income = input.nextInt();
    System.out.print("Years of experience: ");
    int years = input.nextint();
    System.out.print("Credit score(between 0 and 850): ");
    int credit = input.nextInt();

    if(income >= 350000 $$ credit >= 650 $$ years >= 2){
        int loanamount = income * 5;
    System.out.print("Eligible");
        } else
        System.out.println("Not Eligible");
    }
}
