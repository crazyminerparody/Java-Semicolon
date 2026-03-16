import java.util.Scanner;

public class Primenumber{
    public static void main(String...args){

    int number = 11;

    boolean primeNum = true; 

        for(int index = 2; index <= number; index++){

            if (number % index == 0){
                primeNum = false;
}
}

        if (primeNum && number > 1){
            System.out.println(number + "is a prime number"); 
        } else {
            System.out.println(number + "is not a prime number");
        }









}
}
