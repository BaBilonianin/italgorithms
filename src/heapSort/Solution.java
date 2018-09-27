package heapSort;

import java.util.Arrays;

/**
 * Created on 27.09.2018.
 * Пирамидальная сортировка
 */
public class Solution {

    static int heapsize;

    public static void main(String[] args) {
        int[] source = {5, 4, 3, 2, 1, 8, 3, 5, 6, 10, 12, 33, 12};

        heapSort(source);
        System.out.println(Arrays.toString(source));
    }

    private static void heapSort(int[] source) {
        buildMaxHeap(source);
        int temp;
        for (int i = source.length - 1; i >= 0; i--) {
            temp = source[0];
            source[0] = source[i];
            source[i] = temp;
            heapsize--;
            maxHeapify(source, 1);
        }
    }

    static void buildMaxHeap(int[] A) {
        heapsize = A.length;
        for (int i = A.length / 2; i > 0; i--) {
            maxHeapify(A, i);
        }
    }

    static void maxHeapify(int[] A, int i) {
        int l = left(i);
        int r = right(i);
        int temp;
        int largest;
        if (l <= heapsize && A[l - 1] > A[i - 1])
            largest = l;
        else largest = i;
        if (r <= heapsize && A[r - 1] > A[largest - 1])
            largest = r;
        if (largest != i) {
            temp = A[i - 1];
            A[i - 1] = A[largest - 1];
            A[largest - 1] = temp;
            maxHeapify(A, largest);
        }
    }

    int parent(int i) {
        return i / 2;
    }

    private static int left(int i) {
        return 2 * i;
    }

    private static int right(int i) {
        return 2 * i + 1;
    }
}
