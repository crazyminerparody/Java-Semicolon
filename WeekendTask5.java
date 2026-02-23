public class WeekendTaskThree{
    public static void main(String...args){
    int position = 0; 
    String name = "semicolon";

        for(int index = 0; index < name.length(); index++){

        char letters = name.charAt(index);

            if(letters == 'a'  || letters == 'e' || letters == 'i' || letters == 'o' || letters == 'u'){
                position = index;
                    break;
}
}



        System.out.println("The position of the first vowel: " + position);
}
}
