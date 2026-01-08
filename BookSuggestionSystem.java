import java.util.Scanner;
import java.util.ArrayList;

public class BookSuggestionSystem {

    public static void main(String[] args) {

        ArrayList<String> library = new ArrayList<>();
        Scanner inputCollector = new Scanner(System.in);

        while (true) {

            String menu = """
               APPLICATION SAMPLE
            Welcome to the Book Suggestion System!
            
            1. Get Suggestions
            2. Add Book
            3. Remove Book
            4. Update Book
            5. Show All Books
            6. Exit
            """;

            System.out.print(menu);
            System.out.print("Enter operation: ");
            int number = inputCollector.nextInt();
            inputCollector.nextLine(); 

            if (number == 1) {

                System.out.println("\nHere are my suggestions:\n");

                System.out.println("Book Title: The Hobbit | Page: 47");
                System.out.println("Book Title: The Dark Wizard of Oz | Page: 59");
                System.out.println("Book Title: Know Who You Are in Christ! | Page: 78");

                System.out.print("\nWould you like another suggestion? (yes/no): ");
                String option = inputCollector.nextLine();

                if (option.equalsIgnoreCase("yes")) {
                    System.out.println("Book Title: The Mystery | Page: 49");
                }

            } else if (number == 2) {

                System.out.print("Enter the book title: ");
                String bookTitle = inputCollector.nextLine();
                library.add(bookTitle);
                System.out.println("Book added successfully!");

            } else if (number == 3) {

                System.out.print("Enter the book title to remove: ");
                String removedBook = inputCollector.nextLine();

                if (library.remove(removedBook)) {
                    System.out.println("Book removed successfully!");
                } else {
                    System.out.println("Book not found!");
                }

            } else if (number == 4) {

                System.out.print("Enter the old title: ");
                String oldTitle = inputCollector.nextLine();

                if (library.contains(oldTitle)) {
                    System.out.print("Enter the new title: ");
                    String newTitle = inputCollector.nextLine();
                    library.set(library.indexOf(oldTitle), newTitle);
                    System.out.println("Book updated successfully!");
                } else {
                    System.out.println("Book not found!");
                }

            } else if (number == 5) {

                if (library.isEmpty()) {
                    System.out.println("Library is empty.");
                } else {
                    System.out.println("All Books:");
                    for (String book : library) {
                        System.out.println("- " + book);
                    }
                }

            } else if (number == 6) {

                System.out.println("Thank you for using the Book Suggestion System!");
                inputCollector.close();
                break;

            } else {
                System.out.println("Invalid option! Please try again.");
            }
        }
    }
}

