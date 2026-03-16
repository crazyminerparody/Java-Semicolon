public class Firedrill4{

    public static void printValues(int[] index) {
        for (int counter = 0; counter < index.length; counter++) {
                if(counter % 3 == 0){
                System.out.println(counter);
} else {
                    System.out.println(0);
}

        }
    }

    public static void main(String...args) {

        int[] numbers = {1,2,3,4,5,6,7,8,9,10};

        printValues(numbers);
    }
}
