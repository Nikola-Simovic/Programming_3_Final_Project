package packages.searching_packages;

public class BinarySearch {
    public static void basic_binary_search(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;
        boolean found = false;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == target) {
                System.out.println("\nFound");
                found = true;
                break;
            } else if (array[mid] < target) {
                low = mid + 1;  // Searches the right half
            } else {
                high = mid - 1;  // Searches the left half
            }
        }

        if (!found) {
            System.out.println("\nNot found");  // In case the desired target isnt found, prints "Not found"
        }
    }
}
