import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


import packages.searching_packages.BinarySearch;                   //importing the packages needed to run the program
import packages.searching_packages.LinearSearch;
import packages.sorting_packages.InsertionSort;
import packages.sorting_packages.QuicksortSort;

public class SortingMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] searching_array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        boolean whileRunner = true;

        while (whileRunner) {                                         // The while loop will run until q/Q is read from the users input so a runner change to false will exit the app
            System.out.println("\nMenu of Searching and Sorting Testbed.\n");
            System.out.println("1)   Linear searching");
            System.out.println("2)   Binary searching");
            System.out.println("3)   O(n^2) type of sorting");
            System.out.println("4)   (n*log(n)) type of sorting");
            System.out.println("5)   Sorting performance");
            System.out.println("\nq/Q)   Quit\n");
            System.out.print("Your choice: ");

            String choice = scanner.nextLine();
            String lowercaseChoice = choice.toLowerCase();           // Done to simplify the exiting process by reading Q as q


            switch (lowercaseChoice) {                               // The switch block that holds the main options of the code
                case "1":
                    System.out.print("In the list are values 0, ..., 9; which value would you like to search with linear search? ");
                    try {                                           // The try/catch blocks make it so the wrong input will not break the app, but will simply be processed so the app can continue.
                        int user_choice = Integer.parseInt(scanner.next());
                        scanner.nextLine();                         // Done to clear the scanner, so the newline character isnt read
                        LinearSearch.basic_linear_search(searching_array, user_choice);

                    } catch (NumberFormatException e) {
                        System.out.println("\nNot found");
                        scanner.nextLine();
                        continue;
                    }
                    break;

                case "2":
                    System.out.print("In the list are values 0, ..., 9; which value would you like to search with binary search? ");
                    try {
                        int user_choice = Integer.parseInt(scanner.next());
                        scanner.nextLine();
                        BinarySearch.basic_binary_search(searching_array, user_choice);

                    } catch (NumberFormatException e) {
                        System.out.println("\nNot found");
                        scanner.nextLine();
                        continue;
                    }
                    break;

                case "3":
                    System.out.println("\nData set before insertion sorting:");
                    int[] random_integers_array_insertionSort = generate_random_ints_array(10, -100, 100);
                    System.out.println(Arrays.toString(random_integers_array_insertionSort));
                    InsertionSort.insertionSort(random_integers_array_insertionSort);

                    break;

                case "4":
                    System.out.println("\nData set before quicksort:");
                    int[] random_integers_array_quicksort = generate_random_ints_array(10, -100, 100);
                    System.out.println(Arrays.toString(random_integers_array_quicksort));
                    QuicksortSort.quickSort(random_integers_array_quicksort);
                    break;

                case "5":
                    System.out.println("Choice 5 not implemented.");
                    break;

                case "q":
                    System.out.println("Thank you for using the app.\nQuitting...\n");
                    scanner.close();
                    whileRunner=false;
                    break;

                default:
                    System.out.println("Choice "+choice+" not implemented.");                     //by default,if the wrong input is given it will state that the choice simply isnt implemented.
            }
        }

    }

    public static int[] generate_random_ints_array(int size, int min, int max) {                     //The random array generator
        Random array_item = new Random();
        return array_item.ints(size, min, max + 1).toArray();
    }


}
