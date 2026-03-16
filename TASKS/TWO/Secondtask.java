import java.util.Scanner;

public class Secondtask{

    public static void main(String...args){

    Scanner inputCollector = new Scanner(System.in);

    System.out.println("Enter an integer input: ");
    int number = inputCollector.nextInt();

    int factorial = 1;

        for(int count = 1; count <= number; count++){
            factorial *= 1;

}

    System.out.println(number + factorial + " is the factorial");
}
}
