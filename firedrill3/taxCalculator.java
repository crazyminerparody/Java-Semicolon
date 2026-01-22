// collect input from user
// determine the total tax of each of three citizen
// determine the citizen total tax
// display the citizen total tax

import java.util.Scanner;

public class taxCalculator{ 
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of total taxes: ");
        int maxCount = input.nextInt();

        int counter = 1;

        while(counter <= maxCount){
        
        System.out.println("Enter citizen name: ");
        String name = input.nextLine();

        System.out.println("Enter citizen's taxrate: ");
        double taxrate = input.nextInt();

        System.out.println("Enter citizen's earnings: ");
        int earnings = input.nextInt();

        taxrate = 15/100 * 30000;
        earnings = 20/100 * 30000;

        if (earnings <= 30000){
        taxrate = 0.15 * earnings;
        }
        else{
        taxrate = (30000 * 0.15) + ((earnings * 30000) * 0.20);
}

        System.out.printf("The citizen's total tax is %.2f: ", taxrate);
        
    }
}
}

