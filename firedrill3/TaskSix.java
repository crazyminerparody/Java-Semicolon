import java.util.Scanner;
import java.util.Arrays;
public class TaskFive{
public static void main(String...args){
 
    int sum = 0;
    int [] numbers = {1,2,3,4,5,6,7,8,9,10};
    int elements = 0;

    for(int index = 0; index < numbers.length; index++){
        if (index % 2 != 0){
    elements = numbers[index];
    System.out.println(elements);

    sum += elements;
}

}
    System.out.printf("The sum is %d", sum);

}

}
