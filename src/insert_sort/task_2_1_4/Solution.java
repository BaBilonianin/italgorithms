package insert_sort.task_2_1_4;

/*
* 2.1-4
Consider the problem of adding two n-bit binary integers, stored in two n-element
arrays A and B. The sum of the two integers should be stored in binary form in
2.2 Analyzing algorithms 23
an .n C 1/-element array C. State the problem formally and write pseudocode for
adding the two integers.
* */

public class Solution {
    public static void main(String[] args) {
        byte[] A = new byte[]{1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0};
        byte[] B = new byte[]{1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0};
        byte[] C = new byte[B.length + 1];
        doSometihing(A, B, C);
    }

    private static void doSometihing(byte[] a, byte[] b, byte[] c) {
        int intA = countIntFromArray(a);
        int intB = countIntFromArray(b);
        c = countArrayFromInt(intA + intB);
    }

    private static byte[] countArrayFromInt(int i) {
        
        return new byte[0];
    }

    private static int countIntFromArray(byte[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result = a[i] == 0 ? result : result + getPow(2, i);
        }
        return 0;
    }

    private static int getPow(int base, int exponent) {
        int i  = 1, result = base;
        while (i < exponent) {
            result = result * base;
            i++;
        }
        return base;
    }


}