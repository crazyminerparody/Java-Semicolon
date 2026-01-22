import java.util.Scanner;
import java.util.ArrayList;

public class TransactionLog{
    public static void main(String... args){
    Scanner inputCollector = new Scanner(System.in);

    ArrayList<String> transHistory = new ArrayList<>();

    double balance = 0.0;
    
    while(true){
    String menu = """
            
    Welcome to Transaction Log App

    1. Deposit
    2. Withdraw
    3. Show transactions
    4. Exit
   """;

    System.out.println(menu);
    System.out.print("Enter your choice: ");
    int selectOption = inputCollector.nextInt();

    if(selectOption == 1){
    System.out.println("Enter deposit amount: ");
    double deposit = inputCollector.nextDouble();
    balance += deposit;
    String bank = String.format("Deposited %.2f and New Balance %.2f: ",deposit,   balance);
    transHistory.add(bank);
    System.out.println(bank);
    }
    
    else if(selectOption == 2){
    System.out.println("Enter withdrawal amount: ");
    double withdraw = inputCollector.nextDouble();
    balance -=  withdraw;
    String bank = String.format("Withdrew: %.2f and New Balance %.2f: ", withdraw, balance);
    transHistory.add(bank);
    System.out.println(bank);
    }
    else if(selectOption == 3){
    System.out.println("Transactions so far: ");
      
    for(int index = 0; index < transHistory.size(); index++){ 
    System.out.println((index + 1)+ ":" + transHistory.get(index));
}
}
    else if(selectOption == 4){
    System.out.println("Final Balance: " + balance);
    break;
}
    else {
    System.out.println("You have selected an invalid option!!\nGoodbye");
}
}

}

 


















}

