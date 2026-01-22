import java.util.Scanner;
public class Time{
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("Enter time in seconds: ");
    int time = input.nextInt();
    int hours = time/3600;
    int minute = (time%3600)/60;
    int seconds = time % 60;

    System.out.printf("Time: %02d:%02d:%02d%n", hours,minute,seconds);
    }
}
