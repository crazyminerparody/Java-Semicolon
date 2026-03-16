//collect 10 numbers and print the even numbers

import java.util.Scanner;

public class Evennumbers{
    public static void main(String...args){
        
    Scanner inputCollector = new Scanner(System.in);


    for(int index = 1; index <= 10; index++){

    System.out.println("Enter ten numbers: ");
    int number = inputCollector.nextInt();

    if(number % 2 == 0){
            System.out.println(number + " is even");
}

    
}
}
}
