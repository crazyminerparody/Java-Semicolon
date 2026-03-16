// collect input from user 
// collect the credit card limit on a charge account
// collect account number 
// collect balance at the begiining of the month
// collect total of all items charged by the customer this month
// collect total of all credits applied to the cutomer's account this month
// collect credit limit
// calculate the new balance 
// display the new balance 
// determine whether the new balance exceeds customer credit limit
// if credit limit is exceeded, print credit limit is exceeded

import java.util.Scanner;

public class creditCardCalculator{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
    
        System.out.println("Enter credit card limit: ");
        int cardlimit = input.nextInt();

        System.out.println("Account number: ");
        int acctno = input.nextInt();

        System.out.println("Balance at the beginning of the month: ");
        int balance = input.nextInt();

        System.out.println("total of all items charged by cutomer this month: ");
        int items = input.nextInt();

        System.out.println("total of all credits applied to the customer's account this month: ");
        int credits = input.nextInt();

        System.out.println("allowed credit limits: ");
        int limits = input.nextInt();

        newbalance = ("beginning balance + charges - credits");
        System.out.println("The new balance is: ", newbalance);

        if(newbalance >= customercreditlimit){
        System.out.println("Credit limit not exceeded");
    }
        else{
        System.out.println("Credit limit exceeded");
    }
}
    }
