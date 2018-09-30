package radixSort;

public class Solution {
    public static void main(String... args) {
        int[] arr1 = new int[]{1, 0, 4, 3, 5, 7, 1, 3, 4, 2, 6, 8, 2};
        int[] arr2 = new int[]{1, 0, 4, 3, 5, 7, 1, 4, 4, 2, 6, 8, 2};
        int[] arr3 = new int[]{1, 3, 4, 3, 5, 7, 8, 3, 4, 2, 6, 8, 2};
        int[] arr4 = new int[]{1, 0, 4, 3, 5, 7, 1, 3, 6, 2, 6, 8, 2};
        int[] arr5 = new int[]{1, 3, 4, 3, 5, 7, 1, 3, 4, 2, 6, 8, 2};
        int[][] source = {arr1, arr2, arr3, arr4, arr5};
        radixSort(source);
    }

    private static void radixSort(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int[] guideArray = getArrayForSorting(i, arr);
            countingSort.Solution.countingSort(guideArray, guideArray.length);
            sortSourceArray(guideArray, arr, i);
        }
        for (int i : resultArray)
            System.out.print(i + " ");
    }

//    private static void sortSourceArray(int[] guideArray, int[][] arr, int i) {
//        int[][] temp = new int[arr.length][];
//        for (int j = 0; j < guideArray.length; j++)
//            temp[j] = arr[j];
//
//    }

    private static int[] getArrayForSorting(int[][] arr,int i) {
        int[] result = new int[arr.length];
        for (int g = 0; g < arr.length; g++)
            result[g] = arr[i][g];
        return result;
    }

    public static int[][] countingSortForTwoDimensionalArray(int[][] arr, int maxElement,int x) {
        int[] countArray = new int[maxElement + 1];
        int[][] resultArray = new int[arr.length][];


        int[] auxiliaryArray = getArrayForSorting(arr,x);

        for (int j = 0; j < auxiliaryArray.length; j++) {
            countArray[auxiliaryArray[j]]++;
        }

        for (int i = 0; i < countArray.length-1; i++) {
            countArray[i+1]=countArray[i]+countArray[i+1];
        }

        for (int i = arr.length-1; i >= 0; i--) {
            resultArray[countArray[auxiliaryArray[i]]-1]=auxiliaryArray[i];
            countArray[auxiliaryArray[i]]--;
        }

        for (int i : resultArray)
            System.out.print(i + " ");
    }
}

