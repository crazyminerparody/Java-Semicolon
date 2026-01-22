import java.time.LocalDateTime;
import java.util.Scanner;
import java.util.ArrayList;

public class CheckoutApp{
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        LocalDateTime today = LocalDateTime.now();

        ArrayList <String> list = new ArrayList <String>();
        ArrayList <Integer> itemunits = new ArrayList <Integer>();
        ArrayList <Double> itemprices = new ArrayList <Double>();
    
        System.out.print("Input the customer's name: ");
        String name = inputCollector.nextLine();

        String product_Catalog;
        int product_unit;
        double price_of_each_product;


     while (true){

        System.out.print("What did the user buy: ");
        product_Catalog = inputCollector.nextLine();

        if(list.contains(product_Catalog)){
            int index = list.indexOf(product_Catalog);

        System.out.print("How many pieces: ");
        product_unit = inputCollector.nextInt();
        inputCollector.nextLine();

        itemunits.set(index, itemunits.get(index) + product_unit);
        }

        else{
            list.add(product_Catalog);

        System.out.print("How many pieces: ");
        product_unit = inputCollector.nextInt();
        itemunits.add(product_unit);

        System.out.print("How much per item: ");
        price_of_each_product = inputCollector.nextDouble();
        itemprices.add(price_of_each_product);

        inputCollector.nextLine();
        }
        
        System.out.print("Do you want to add more items(yes/no): ");
        String advance = inputCollector.nextLine().toLowerCase();

        if(advance.equals("no"))
            break;

}

        System.out.print("What is the cashier's name: ");
        String cashiername = inputCollector.nextLine();

        System.out.print("How much discount will the user get: ");
        double discount = inputCollector.nextDouble();
        
         double sum = 0.0;
         for (int count = 0; count < list.size(); count++){
            sum += (itemunits.get(count) * itemprices.get(count));
          }

            double discountTotal = sum * (discount/100);
            double VAT = sum * 0.175;
            double sum_of_Bill = sum - discountTotal + VAT; 

            System.out.println("-------------------------------------------------------");
            System.out.println("SEMICOLON SUPERSTORES");
            System.out.println("MAIN BRANCH");
            System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");
            System.out.printf("Date: %1$te %1tb %1$tY %tr\n", today, today);
            System.out.printf("Cashier: %s%n", cashiername);
            System.out.printf("Customer Name: %s%n", name);

            System.out.println("--------------------------------------------------------");
            System.out.printf("%-15s %-10s %-20s %-20s%n", "Item", "Qty",  "Price", "Total");
            System.out.println("--------------------------------------------------------");

            for (int i = 0; i < list.size(); i++){
                double itemTotal = itemunits.get(i) * itemprices.get(i);

                System.out.printf("%-15s %-10d %-19.2f %-19.2f%n", list.get(i), itemunits.get(i), itemprices.get(i), itemTotal);
            }

           System.out.println("---------------------------------------------------------");
           System.out.printf("%34s%17.2f%n", "Sub Total: ", sum);
           System.out.printf("%34s%17.2f%n", "Discount: ", (discount*sum));
           System.out.printf("%34s%17.2f%n", "VAT @ 17.50%", VAT);
           System.out.println("---------------------------------------------------------");
           System.out.printf("%34s%17.2f%n", "Bill Total: ", sum_of_Bill);
           System.out.println("---------------------------------------------------------");
           System.out.printf("%37s19%.2f%n", "THIS IS NOT A RECEIPT, KINDLY PAY%s", sum_of_Bill);
           System.out.println("---------------------------------------------------------");

           System.out.println("How much did the customer give to you?");
           int amount = inputCollector.nextInt();

           if (amount >= sum_of_Bill){

             System.out.println("-------------------------------------------------------");
            System.out.printf("\nSEMICOLON SUPERSTORES\nMAIN BRANCH\nLOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.");

            System.out.printf("Cashier: %s%nCustomer Name: " , name);
            System.out.printf("Date: %1$te %1tb %1$tY %tr\n", today, today);
            System.out.println("--------------------------------------------------------");
            System.out.println("--------------------------------------------------------");

            for (int i = 0; i < list.size(); i++){

                            System.out.printf("%-15s %-10s %-15s %-15s%n", "Item", "Qty", "Price", "Total");
                }

           System.out.println("---------------------------------------------------------");
           System.out.printf("%34s%17.2f%n", "Sub Total: ", sum);
           System.out.printf("%34s%17.2f%n", "Discount: ", (discount*sum));
           System.out.printf("%34s%17.2f%n", "VAT @ 17.50%", VAT);
           System.out.println("---------------------------------------------------------");
           System.out.printf("%34s%17.2f%n", "Total Bill: ", sum_of_Bill);
           System.out.printf("%34s%17.2f%n", "Amount Paid: ", amount);
           System.out.printf("%34s%17.2f%n", "Balance", (amount - sum_of_Bill));
           System.out.println("---------------------------------------------------------");
           System.out.printf("%42s%n", "THANK YOU FOR YOUR PATRONAGE");
           System.out.println("---------------------------------------------------------");

            }       

            else{
                
                System.out.println("You Don't Have Enough Funds!!");


    }
            }

    }               
