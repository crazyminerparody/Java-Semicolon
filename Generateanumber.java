import java.util.Scanner;
import java.util.Random;
public class Generateanumber{
    public static void main(String...args){
        Scanner inputCollector = new Scanner(System.in);

        System.out.print("Guess a number between 1-20: ");
        int guessednumber = inputCollector.nextInt();

        Random rand = new Random();
        int number = rand.nextInt(20)+ 1;

        if(guessednumber != number){
    System.out.println("you have guessed incorrectly!");
}   else if(guessednumber < number && guessednumber > 20){
    System.out.println("You have guessed incorrectly so the number is: ", number);
}

}
}

