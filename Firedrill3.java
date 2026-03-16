import java.util.Random;
public class Firedrill3{
    public static void main(String...args) {

    Random rand = new Random();

    for (int counter = 1; counter <= 10; counter++) {
        int number = rand.nextInt(50); 
}

  if(number % 2 == 0){
    System.out.println(number);
    }

}

}
