package bubbleSort;

/**
 * Created on 28.09.2018.
 */
public class Solution {
    public static void main(String[] args) {
        int[] input = new int[]{31, 41, 59, 26, 41, 58};
        bubbleSort(input);
    }

    static void bubbleSort(int[] A) {
        int i, j, temp;
        for (j = 1; j < A.length; j++) {
            for (i = A.length - 1; i >= j; i--) {
                if (A[i] < A[i - 1]) {
                    temp = A[i - 1];
                    A[i - 1] = A[i];
                    A[i] = temp;
                }
            }
        }
        for (j = 0; j < A.length; j++) {
            System.out.print(A[j] + " ");
        }
    }
}
