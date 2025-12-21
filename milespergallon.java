// collect input from user
// collect miles driven
// collect gallons used
// calculate the miles per gallon
// print out the miles per gallon
// continue to collect input from user
//add all the miles per gallon
// calculate the average of the miles per gallon
// print out the average miles per gallon


import java.util.Scanner;

    public class milespergallon{
        public static void main(String [] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the number of trips taken: ");
            int tripsTaken = input.nextInt();
            
            int counter = 1;
            sumOfmilesPerGallon = 0;

            while(counter <= tripsTaken){

            System.out.print("Enter miles driven: ");
            int miles = input.nextInt();

            System.out.print("Enter gallons used: ");
            int gallons = input.nextInt();

            double milesPerGallon = (double) miles/gallon;

            System.out.println("the miles per gallon for trip %d is %.2f", counter, milesPerGallon)

            sumOfmilesPerGallon += sumOfmilesPerGallon;

            counter++;
}
 double averageMilesPerGallon = (double) miles/gallon;           
    }
        
}
