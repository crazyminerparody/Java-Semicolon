//collect 10 numbers, sum up and print the odd numbers

import java.util.Scanner;

public class Sumofoddnumbers{
    public static void main(String...args){

    int sumOfOdd = 0;
        
    Scanner inputCollector = new Scanner(System.in);

    for(int index = 1; index <= 10; index++){

    System.out.println("Enter ten numbers: ");
    int number = inputCollector.nextInt();

     

    if(number % 2 != 0){

   sumOfOdd += number;

}
}

   System.out.printf("The sum of Odd numbers is: " + sumOfOdd);

}
}
