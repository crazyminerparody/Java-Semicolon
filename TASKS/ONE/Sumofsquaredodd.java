//collect 10 numbers, sum each squared even numbers and print the mean of all numbers

import java.util.Scanner;

public class Sumofsquaredodd{
    public static void main(String...args){
        
    Scanner inputCollector = new Scanner(System.in);
    
    int sumOfEachSquaredOdd = 0;

    for(int index = 1; index <= 10; index++){

    System.out.println("Enter ten numbers: ");
    int number = inputCollector.nextInt();

        if(number % 2 != 0){
    sumOfEachSquared += number * number;
        }
       
}

System.out.println(sumOfEachSquared + " is the sum of each squared of odd numbers");    



}
}

