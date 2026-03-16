//collect 10 numbers, sum both squared even numbers and print the mean of all numbers

import java.util.Scanner;

public class Sumofallevenandoddnumbers{
    public static void main(String...args){
        
    Scanner inputCollector = new Scanner(System.in);
    
    int sumOfAll = 0;
    int sumOfEachSquaredEven = 0;
    int sumOfEachSquaredOdd= 0;

    for(int index = 1; index <= 10; index++){

    System.out.println("Enter ten numbers: ");
    int number = inputCollector.nextInt();

        if(number % 2 != 0){
    sumOfAll = sumOfEachSquaredEven + sumOfEachSquaredOdd;
        }
       
}

System.out.println(sumOfAll + " is the sum of each squared of odd numbers");    



}
}

