import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter anything: ");
        String name = input.nextLine();



        for(int counter = name.length()-1; counter >= 0; counter--){
       
      System.out.print(name.charAt(counter));
}        

    System.out.println();
    
    }
    
}
