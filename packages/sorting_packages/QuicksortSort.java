package packages.sorting_packages;

import java.util.Arrays;

public class QuicksortSort {         //a simple QuickSort implementation

    public static void quickSort(int[] array) {
        quickSortMain(array, 0, array.length - 1);        
        System.out.println("\nData set after quicksort:");
        System.out.println(Arrays.toString(array));
    }

    public static void quickSortMain(int[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            quickSortMain(array, low, pivotIndex - 1);
            quickSortMain(array, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j] < pivot) {
                i++;


                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    
}
