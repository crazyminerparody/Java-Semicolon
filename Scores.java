import java.util.Scanner;
public class Scores{
    public static void main(String[]args){
    Scanner newObj = new Scanner(System.in);
    System.out.print("Enter first integer score1: ");
    int score1 = newObj.nextInt();
    System.out.print("Enter second integer score2: ");
    int score2 = newObj.nextInt();
    System.out.print("Enter third integer score3: ");
    int score3 = newObj.nextInt();
    int total = score1 + score2 + score3;
    double average = total/3;
    System.out.println("Total: " + total);
    System.out.printf("Average : %2f", average);
    }   
}
