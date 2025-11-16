package algo.sorting;

public class SelectionSort {
    public static  void main(String[] args) {
        int[] arr = {1,2,4,5,0,8,3,6};

        sort(arr);
        print(arr);
    }

    static void sort(int[] arr) {
        for (int ind = 0; ind < arr.length ; ind++) {
            //step-1 :  take min number index
            int currMinimumIndex = ind;

            // step-2 : finding min number
            for (int ind2 = ind ; ind2 < arr.length; ind2++) {
                if (arr[ind2] < arr[currMinimumIndex]) {
                    currMinimumIndex = ind2;
                }
            }

            //step-3:  swap mini value with arr index (which is next index after sorted index)
            int temp = arr[ind];
            arr[ind] = arr[currMinimumIndex];
            arr[currMinimumIndex] = temp;
        }
    }

    static void print(int[] arr) {
        for (int item : arr) System.out.print(item + " ");
    }
}

/*
* Best Case - O(n^2)
* Avg Case - O(n^2)
* Worst Case - O(n^2)
* */
