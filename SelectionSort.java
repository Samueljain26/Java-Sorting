import java.util.*;

class SelectionSort {
    // Method to sort
    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[smallest]) {
                    smallest = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
        }

        // Display sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11, 90};
        selectionSort(arr);
    }
}
/*11 12 22 25 64 90  */