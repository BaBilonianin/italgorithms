package bucketSort;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String... args) {
        float[] arr = new float[]{0.1f, 0.3f, 0.45f, 0.43f, 0.55f, 0.97f, 0.11f, 0.13f, 0.24f, 0.22f, 0.26f, 0.38f, 0.72f};
        bucketSort(arr);
    }

    //0<a[i]<1
    private static void bucketSort(float[] a) {
        int n = a.length;
        ArrayList<ArrayList<Float>> b = new ArrayList<>(n);
        for (float anA : a) b.add(new ArrayList<>());

        for (int i = 1; i <= n; i++)
            b.get((int) (n * a[i - 1])).add(a[i - 1]);

        for (int i = 0; i < n; i++)
            b.get(i).sort(Float::compareTo);

        System.out.print(b + "\n");

        for (int i = 0; i < n; i++) {
            while (b.get(0).size() == 0)
                b.remove(0);
            a[i] = b.get(0).get(0);
            b.get(0).remove(0);
        }
        System.out.print(Arrays.toString(a) + "\n");
    }
}
