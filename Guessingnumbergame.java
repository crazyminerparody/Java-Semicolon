import java.util.Scanner;
public class Guessingnumbergame{

    public static void main(String...args){

    Scanner inputCollector = new Scanner(System.in);

    int number = 50;
    
    int numberGuessed = 0;
    while(numberGuessed != 50){
    System.out.println("Guess a number: ");
      numberGuessed = inputCollector.nextInt();
        

        if(numberGuessed > number){
            System.out.println("the guessed number is too high");
}       else if(numberGuessed < number){
            System.out.println("the guessed number is too low");
}       else if(numberGuessed == number){
            System.out.println("the guessed number is justright");

}

}












}
}
