public class WeekendTaskThree{
    public static void main(String...args){
    int counter = 0; 
    String name = "SeMiCoLoN";

        for(int index = 0; index < name.length(); index++){

        char bj = name.charAt(index);

            if(Character.isUpperCase(bj)){
                counter++;
}
}



        System.out.println("The uppercase letters are: " + counter);
}
}
