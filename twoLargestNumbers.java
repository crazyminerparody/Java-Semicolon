// collect input from user
// collect series of 10 integers
//determine the two largest integer
// print the largest two integers


import java.util.Scanner;
public class largestNumber{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first integer: ");
        int numberone = input.nextInt();
        
        System.out.println("Enter second integer: ");
        int numbertwo = input.nextInt();


        int counter = 1;
        int largest = numberone;
        int secondlargest = numbertwo;
        
        while (counter <= 10){
        numberone = input.nextInt();
        numbertwo = input.nextInt();

        if(numberone > largest){
        largest = numberone;
        }
        if(numbertwo > secondlargest)
        largest = numbertwo;
counter++;
}        


        System.out.printf("%d is the largest\n", largest);
        System.out.printf("%d is the secondlargest\n", secondlargest);
    }
}
