//collect 10 numbers and sum and print the even numbers

import java.util.Scanner;

public class Sumofevennumbers{
    public static void main(String...args){

    int sumOfEven = 0;
        
    Scanner inputCollector = new Scanner(System.in);

    for(int index = 1; index <= 10; index++){

    System.out.println("Enter ten numbers: ");
    int number = inputCollector.nextInt();

     

    if(number % 2 == 0){

   sumOfEven += number;

}
}

   System.out.println("The sum of even numbers is: " + sumOfEven);

}
}
