import java.util.Scanner;

public class CreditCardValidator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your credit card number: ");
        String cardNumber = input.nextLine();

        int length = cardNumber.length();

        int sumEven = 0;
        int sumOdd = 0;

        String cardType = "Invalid card";
        String cardValidity;

        // Step 1: Process digits in even positions (from the right)
        for (int i = length - 2; i >= 0; i -= 2) {
            int digit = cardNumber.charAt(i) - '0';
            digit *= 2;

            if (digit > 9) {
                digit -= 9;
            }

            sumEven += digit;
        }

        // Step 2: Process digits in odd positions (from the right)
        for (int i = length - 1; i >= 0; i -= 2) {
            int digit = cardNumber.charAt(i) - '0';
            sumOdd += digit;
        }

        // Step 3: Check validity using Luhn Algorithm
        int total = sumEven + sumOdd;

        if (total % 10 == 0) {
            cardValidity = "Valid";
        } else {
            cardValidity = "Invalid";
        }

        // Step 4: Detect card type
        if (cardNumber.startsWith("4")) {
            cardType = "Visa Card";
        } 
        else if (cardNumber.startsWith("5")) {
            cardType = "MasterCard";
        } 
        else if (cardNumber.startsWith("6")) {
            cardType = "Discover Card";
        } 
        else if ((cardNumber.startsWith("34") || cardNumber.startsWith("37")) && length == 15) {
            cardType = "American Express Card";
        }

        // Step 5: Display result
        System.out.println("\nCredit Card Type: " + cardType);
        System.out.println("Credit Card Number: " + cardNumber);
        System.out.println("Credit Card Length: " + length);
        System.out.println("Credit Card Validity: " + cardValidity);

        input.close();
    }
}

