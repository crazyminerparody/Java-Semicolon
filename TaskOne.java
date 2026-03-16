public class TaskOne{

   static int SumOfOdd = 0;
    static int SumOfEven = 0;

    public static void EvenOddIntegers(int[] numbers){
    for(int index = 0; index < numbers.length; index++){
if(numbers[index] % 2 == 0 ){
    SumOfEven += numbers[index];
} else {
    SumOfOdd += numbers[index];
}
}
System.out.printf("The sum of both even and odd is: %d, %d", SumOfOdd, SumOfEven);
}
}
public static void main(String...args){
    int [] nums = {1,2,3,4,5,6};
    TaskOne.EvenOddIntegers(nums);
    
 } 





