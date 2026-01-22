import java.util.Scanner;
import java.util.Arrays;
public class TaskFive{
public static void main(String...args){
 
    int [] numbers = {1,2,3,4,5,6,7,8,9,10};
    int elements = 0;

    for(int index = 1; index < numbers.length; index+= 2){
    elements = numbers[index];
    System.out.println(elements);
 
}

} 
     
}
