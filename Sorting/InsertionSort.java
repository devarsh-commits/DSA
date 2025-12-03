package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 3, 4, 1, 9 };
        for (int i = 1; i < arr.length; i++) {
            int token=i;
            int j = i - 1;
            while (j >= 0 && arr[j] > arr[token]) {
                int temp = arr[token];
                arr[token]=arr[j];
                arr[j]=temp;
                j--;
                token--;

            }
    
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

}
