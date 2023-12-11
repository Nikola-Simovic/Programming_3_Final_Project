package packages.searching_packages;

public class LinearSearch {          // The linear search implementation
    private LinearSearch() {}

    public static void basic_linear_search(int[] array, int user_choice) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == user_choice) {
                System.out.println("\nFound");
                System.out.flush();
                return;  
            }
        }
        System.out.println("\nNot found");
        System.out.flush();
    }
}