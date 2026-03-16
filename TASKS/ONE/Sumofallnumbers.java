//collect 10 numbers and print the sum of all numbers

import java.util.Scanner;

public class Sumofallnumbers{
    public static void main(String...args){
        
    Scanner inputCollector = new Scanner(System.in);

    int sum = 0;

    for(int index = 1; index <= 10; index++){

    System.out.println("Enter ten numbers: ");
    int number = inputCollector.nextInt();

        sum += number;

           
}

     System.out.println(sum + " is the sum of all numbers");
}
}

