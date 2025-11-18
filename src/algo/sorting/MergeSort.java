package algo.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,8,4,5,6,2,3,6};
        int l = 0, r = arr.length -1;
        mergeSort(arr,l,r);

        print(arr);
    }


    static void mergeSort(int[] arr, int l , int r) {
        if (l >= r) return;

        int mid = (l+r)/2;

        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);

        // merging sorted arrays
        merge(arr,l,mid,r);
    }

    static void merge(int[] arr, int leftIndex, int midIndex, int rightIndex) {
        int len1 = midIndex - leftIndex + 1;
        int len2 = rightIndex - midIndex;

        // creating temp arr for storing the values
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];

        for (int index = 0; index < len1; index++) {
            arr1[index] = arr[leftIndex + index];
        }
        for (int index = 0; index < len2; index++) {
            arr2[index] = arr[(midIndex + 1) + index];
        }

        int index1 = 0, index2 = 0;
        int currentIndex = leftIndex;

        while (index1 < len1 && index2 < len2) {
            if (arr1[index1] < arr2[index2]) {
                arr[currentIndex++] = arr1[index1++];
            } else {
                arr[currentIndex++] = arr2[index2++];
            }
        }

        while (index1 < len1) {
            arr[currentIndex ++] = arr1[index1 ++];
        }

        while(index2 < len2) {
            arr[currentIndex ++] = arr2[index2 ++];
        }
    }


    static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

/*
* Best Case - nlog(n)
* Avg Case - nlog(n)
* Worst Case - nlog(n)
*
* Space complexity - O(n)
* */
