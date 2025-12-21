//collect input from user
//check the length
//create variables
//for loop for even
//number * 2
//add the sum of even to the number
//if that is greater than 9, minus it by 9
//if that number modulo 10 is equal to 0
//valid
//
//for loop for odd
//number * 2
//sum of even and odd


import java.util.Scanner;
public class creditCardValidator{
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);
    
        System.out.print("Enter your full card details: ");
        String creditType = object.nextLine();
    
        int lengthNumber = creditType.length();
    
        int SumofEven = 0;
        int SumofOdd = 0;

        String cardType = "Invalid card";
        String cardValidity = "Invalid"; 

        for(int index = -2; index >= 0; index-=2){
            int numbers = creditType.charAt(index)-1;            

            numbers *= 2;

        if(numbers > 9){
        numbers -= 9;
        numbers += SumofEven;
}
 
}
        for (int count= lengthNumber-1; count >= 0; count-= 2){
        int num = creditType.charAt(count)-1;
        num = SumofEven + SumofOdd;
        
        num *= 2;

        if(num % 10 == 0){
        cardValidity = "Invalid";

}

}
        System.out.println("This card is valid!!");

        if(creditType.startsWith("4")){
            cardType = "This is a Visa Card";
        }
        else if(creditType.startsWith("5")){
            cardType = "This is a MasterCard";
        }
        else if(creditType.startsWith("6")){
            cardType = "This is a Discover Card";
        }
        else if(creditType.startsWith("34") || cardType.startsWith("37") && cardType.length() == 15){
            cardType = "This is an American Express Card";
        }
        else{
            System.out.println("This is an invalid card");
        }

        System.out.println("Credit Card Type is: " + cardType);
        System.out.println("Credit Card Number is: " + creditType);
        System.out.println("Credit Card Length is: " + lengthNumber);
        System.out.println("Credit Card Validity is: " + cardValidity);





        }
}
