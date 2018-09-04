package insert_sort.task_2_1_2;

/*
 * Переписать алгоритм сортировки, чтобы сортировать от последнего элемента к первому*/
public class Solution {
    public static void main(String[] args) {
        int[] input = new int[]{31, 41, 59, 59, 26, 41, 58};

        sortFunction(input);
        showResults(input);
    }

    private static void sortFunction(int[] A) {
        int i, j, key;
        for (j = A.length - 2; j > -1; j--) {
            key = A[j];
            i = j + 1;
            while (i < A.length && A[i] < key) {
                A[i - 1] = A[i];
                i = i + 1;
            }
            A[i - 1] = key;
        }
    }

    private static void showResults(int[] A) {
        int j;
        for (j = 0; j < A.length; j++) {
            System.out.print(A[j]);
            System.out.print(" ");
        }
    }
}