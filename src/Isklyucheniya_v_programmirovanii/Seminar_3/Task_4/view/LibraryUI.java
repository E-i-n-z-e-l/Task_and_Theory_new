package Isklyucheniya_v_programmirovanii.Seminar_3.Task_4.view;

import Isklyucheniya_v_programmirovanii.Seminar_3.Task_4.Library;
import Isklyucheniya_v_programmirovanii.Seminar_3.Task_4.exceptions.AuthorException;

import java.util.Scanner;

public class LibraryUI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        while (true) {
            System.out.println("1. Add Book");
            System.out.println("2. Borrow Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    try {
                        library.addBook(scanner);
                    } catch (AuthorException e) {
                        System.out.println(e.getMessage());;
                    }
                    break;
                case 2:
                    library.borrowBook(scanner);
                    break;
                case 3:
                    library.returnBook(scanner);
                    break;
                case 4:
                    System.out.println("Exiting the library system.");
                    return;
                default:
                    System.out.println("Invalid choice. Please select again.");
            }
        }
    }
}
