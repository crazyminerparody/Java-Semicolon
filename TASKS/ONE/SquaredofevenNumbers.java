//collect 10 numbers and print the Squared of each even numbers

import java.util.Scanner;

public class SquaredofevenNumbers{
    public static void main(String...args){
        
    Scanner inputCollector = new Scanner(System.in);

    int Squaredofevennumbers = 1;

    for(int index = 1; index <= 10; index++){

    System.out.println("Enter ten numbers: ");
    int number = inputCollector.nextInt();

       if(number % 2 == 0){
        Squaredofevennumbers = number * number;

        
}

System.out.println(Squaredofevennumbers + " is the squared of each even number");           
}





}
}

