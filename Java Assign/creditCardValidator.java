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
    
        System.out.println("Enter your full card details: ");
        String creditType = object.nextLine();
    
        int lengthNumber = creditType.length();
    
        int SumofEven = 0;
        int SumofOdd = 0;

        String cardType = "Invalid card";
        String cardValidity; 

        for(int index = lengthNumber -2; index >= 0; index-=2){
            int numbers = creditType.charAt(index)- '0';            

            numbers *= 2;

        if(numbers > 9){
        numbers -= 9;
}
        SumofEven += numbers;
}
        for (int count = lengthNumber-1; count >= 0; count-= 2){
        int numbers = creditType.charAt(count)- '0';
        SumofOdd += numbers;

}
        int total = SumofEven + SumofOdd;

        if(total % 10 == 0){
        cardValidity = "valid";
}
        else {
        cardValidity = "Invalid";
}

        if(creditType.startsWith("4")){
            cardType = "This is a Visa Card";
        }
        else if(creditType.startsWith("5")){
            cardType = "This is a MasterCard";
        }
        else if(creditType.startsWith("6")){
            cardType = "This is a Discover Card";
        }
        else if(creditType.startsWith("34") || cardType.startsWith("37") && lengthNumber == 15){
            cardType = "This is an American Express Card";
        }
        else{
            System.out.println("Card Type not found");
        }

        System.out.println("Credit Card Type: " + cardType);
        System.out.println("Credit Card Number: " + creditType);
        System.out.println("Credit Card Digit Length: " + lengthNumber);
        System.out.println("Credit Card Validity: " + cardValidity);



        }
}
