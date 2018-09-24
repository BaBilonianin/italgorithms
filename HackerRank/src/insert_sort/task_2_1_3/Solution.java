package insert_sort.task_2_1_3;

/*2.1-3
Найти элемент в массиве*/
public class Solution {
    public static void main(String[] args) {
        int[] input = new int[]{31, 41, 59, 26, 41, 58};
        int c = 500;
        showResult(finditem(input, c), c);
    }

    private static boolean finditem(int[] A, int c) {
        int j;
        for (j = 0; j < A.length; j++) {
            if (A[j] == c) return true;
        }
        return false;
    }

    private static void showResult(boolean condition, int c) {
        System.out.print(condition ? c : "nill");
    }
}