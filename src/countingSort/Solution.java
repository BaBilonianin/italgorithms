package countingSort;

/**
 * Created on 26.09.2018.
 *
 * @author me
 * @since 1.0
 */
public class Solution {
    public static void main(String... args) {
        int[] arr = new int[]{1, 0, 4, 3, 5, 7, 1, 3, 4, 2, 6, 8, 2};
        countingSort(arr, 8);
    }

    /*
     * We must know max element in array*/
    private static void countingSort(int[] arr, int maxElement) {
        int[] countArray = new int[maxElement + 1];
        int[] resultArray = new int[arr.length];

        for (int j = 0; j < arr.length; j++) {
            countArray[arr[j]]++;
        }

        for (int i = 0; i < countArray.length-1; i++) {
            countArray[i+1]=countArray[i]+countArray[i+1];
        }

        for (int i = arr.length-1; i >= 0; i--) {
            resultArray[countArray[arr[i]]-1]=arr[i];
            countArray[arr[i]]--;
        }

        for (int i : resultArray)
            System.out.print(i + " ");
    }
}
