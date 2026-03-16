//collect 10 numbers and print the mean of all numbers

import java.util.Scanner;

public class Meanofallnumbers{
    public static void main(String...args){
        
    Scanner inputCollector = new Scanner(System.in);
    
    int sum = 0;
    int mean = 0;

    for(int index = 1; index <= 10; index++){

    System.out.println("Enter ten numbers: ");
    int number = inputCollector.nextInt();

    sum += number;

    mean = sum/10;

       
}

System.out.println(mean + " is the mean of all numbers");    



}
}

