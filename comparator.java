public class comparator{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = input.nextInt();

        if(firstnumber == secondnumber ){
        System.out.println("0");
        }
        else if(firstNumber > secondNumber){
        System.out.println("1");
            } 
        else if(secondNumber > firstNumber)
        System.out.println("-1");
    }
}
