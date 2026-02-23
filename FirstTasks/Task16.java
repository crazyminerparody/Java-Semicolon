public class TaskSixteen {
    public static void main(String... args) {

        String name = "spiderman";
        int vowelCount = 0;

        name = name.toLowerCase();

        for (int index = 0; index < name.length(); index++) {

            if (name.charAt(index) == 'a' || name.charAt(index) == 'e' || name.charAt(index) == 'i' || name.charAt(index) == 'o' || name.charAt(index) == 'u') {

                vowelCount++;
            }
        }

        System.out.println("Number of vowels are: " + vowelCount);
    }
}
