import java.util.Random;
public class TaskOne{
    public static void main(String...args){
    Random rand = new Random();

    for(int index = 0; index < 1; index++){
    int number = rand.nextInt(1, 11);
    System.out.println(number);
}
}
}
