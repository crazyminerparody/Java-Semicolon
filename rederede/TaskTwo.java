import java.util.Random;
import java.util.Scanner;
public class TaskTwo{
    public static void main(String...args){
Scanner inputCollector = new Scanner(System.in);

    System.out.print("Guess a number between 1 and 10: ");
    int guess = inputCollector.nextInt();

    Random rand = new Random();

    int number = rand.nextInt(1, 11);

    for(int index = 0; index < 1; index++){
        if(guess <= number){
    System.out.println("Correct");
} else if(guess > number){
    System.out.println("Wrong guess");
}
    
    System.out.println(number);
}
}
}
