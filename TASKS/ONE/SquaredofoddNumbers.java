//collect 10 numbers and print the Squared of each odd numbers

import java.util.Scanner;

public class SquaredofoddNumbers{
    public static void main(String...args){
        
    Scanner inputCollector = new Scanner(System.in);

    int Squaredofoddnumbers = 1;

    for(int index = 1; index <= 10; index++){

    System.out.println("Enter ten numbers: ");
    int number = inputCollector.nextInt();

       if(number % 2 != 0){
        Squaredofoddnumbers = number * number;

        
}

System.out.println(Squaredofoddnumbers + " is the squared of each odd number");           
}





}
}

