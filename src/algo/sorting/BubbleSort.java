package algo.sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,2,3,6};

        sort(arr);
        print(arr);
    }

    static void sort(int[] arr) {

        int n = arr.length;

        boolean isSwap = false;

        for (int i = 0; i < n; i++) {

            for (int j = 1; j < n-i; j++) {

                if (arr[j-1] > arr[j]) {

                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;

                    isSwap = true;
                }
            }
            if (!isSwap) break;
        }
    }

    static void print(int[] arr) {
        for (int item : arr) System.out.print(item + " ");
    }
}

/*
* BEST CASE - O(n)
* Avg Case - O(n^2)
* Worst Case - O(n^2)
* */
