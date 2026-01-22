import java.util.Scanner;
import java.util.Arrays;
public class TaskNine{
public static void main(String...args){
 
    int minimum = Integer.MAX_VALUE;
    int [] numbers = {1,2,3,4,5,6,7,8,9,10};
    int elements = 0;

    for(int index = 1; index < numbers.length; index+= 2){
    elements = numbers[index];
 if(elements < minimum){
    minimum = elements;
 
}

} 
    System.out.println(minimum);    
}

}
