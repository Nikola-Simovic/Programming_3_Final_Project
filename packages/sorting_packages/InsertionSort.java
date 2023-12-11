package packages.sorting_packages;

import java.util.Arrays;

public class InsertionSort {       //simple insertionSort implementation

    public static void insertionSort(int[] array) {
        int n = array.length;
        
        for (int i = 1; i < n; ++i) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            
            array[j + 1] = key;
        }

        System.out.println("\nData set after insertion sorting:");
        System.out.println(Arrays.toString(array));

    }
    
}
