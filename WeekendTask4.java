public class WeekendTaskFour{
    public static void main(String...args){
    int counter = 0; 
    String name = "SeMiCoLoN";

        for(int index = 0; index < name.length(); index++){

        char bj = name.charAt(index);

            if(Character.isLowerCase(bj)){
                counter++;
}
}



        System.out.println("The lowercase letters are: " + counter);
}
}
