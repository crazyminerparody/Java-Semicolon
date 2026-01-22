import java.util.Scanner;
import java.util.Arrays;
public class Taskeigth{
public static void main(String...args){
 
    int minimum =Integer.MAX_VALUE;
    int [] numbers = {1,2,3,4,5,6,7,8,9,10};
    int elements = 0;

    for(int index = 0; index < numbers.length; index+= 3){
    elements = numbers[index];
    if(elements < minimum){
    minimum = elements;
}
 
}

System.out.println(minimum);     
}

}
