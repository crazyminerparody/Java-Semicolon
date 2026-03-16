public class Firedrill{

    public static void taskOne(int[] index) {
        for (int counter = 0; counter < index.length; counter++) {
            System.out.println(index[counter]);
        }
}
    public static void taskTwo(int[] index) {
        for (int counter = 1; counter < index.length; counter+= 2                                                                                                                                                                               ) {
                if(counter % 2 == 0){
                System.out.println(counter);
}
}
}
  public static void taskThree(int[] index) {
        for (int counter = 0; counter < index.length; counter++) {
                if(counter % 2 != 0){
                System.out.println(counter);
}
    }
}

    public static void main(String...args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        taskOne(numbers);
    taskTwo(numbers);
    taskThree(numbers);
    }
}
