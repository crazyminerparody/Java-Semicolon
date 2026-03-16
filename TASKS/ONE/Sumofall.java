//collect 10 numbers, square all numbers and print the sum of both squared

import java.util.Scanner;

public class Sumofall{
    public static void main(String...args){
        
    Scanner inputCollector = new Scanner(System.in);
    
    int sumOfAll = 0;
    int sumOfSquaredOfAll = 0;

    for(int index = 1; index <= 10; index++){

    System.out.println("Enter ten numbers: ");
    int number = inputCollector.nextInt();

     sumOfSquaredOfAll = number * number; 

    sumOfAll += sumOfSquaredOfAll;
}
 
System.out.println(sumOfAll + " is the sum of all squared numbers");

}

}

