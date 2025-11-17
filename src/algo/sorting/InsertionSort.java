package algo.sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,10,1,6,2};

        sort(arr);
        print(arr);
    }

    static void sort(int[] arr) {

        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int temp = arr[i];

            int j = i;

            while(j > 0 && temp < arr[j-1]) {
                arr[j] = arr[j-1];
                j--;
            }

            arr[j] = temp;
        }
    }

    static void print(int[] arr) {
        for (int item : arr) System.out.print(item + " ");
    }
}

/*
* Best Case - O(n)
* Avg case - O(n^2)
* Worst case - O(n^2)
* */
