package insert_sort.task_2_1_4;

/*
* 2.1-4
Consider the problem of adding two n-bit binary integers, stored in two n-element
arrays A and B. The sum of the two integers should be stored in binary form in
2.2 Analyzing algorithms 23
an .n C 1/-element array C. State the problem formally and write pseudocode for
adding the two integers.
* */

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {
        byte[] A = new byte[]{1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0};
        byte[] B = new byte[]{1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0};
        completeTask(A, B);

        A = new byte[]{1, 0, 0};
        B = new byte[]{1, 0, 0};
        completeTask(A, B);

        A = new byte[]{1, 0, 0, 1, 1};
        B = new byte[]{1, 0, 0, 1, 1};
        completeTask(A, B);
    }

    private static void completeTask(byte[] a, byte[] b) {
        int intA = countIntFromArray(a);  //вычисляем числовое значение А
        int intB = countIntFromArray(b);  //вычисляем числовое значение B
        byte[] c = countArrayFromInt(intA + intB);
        if(c.length!=a.length+1)
            System.out.println("Error: c.length!=a.length+1");
        else print(c);
    }

    private static void print(byte[] c) {
        for (byte element : c) {
            System.out.print(element);
            System.out.print(" ");
        }
        System.out.print("\n");
    }

    private static int countIntFromArray(byte[] a) {
        int result = 0;
        for (int i = a.length - 1; i > -1; i--) {
            if (a[i] != 0) {
                result = result + getPow(2, a.length - 1 - i);
            }
//            result = a[i] == 0 ? result : result + getPow(2, i);
        }
        return result;
    }

    private static int getPow(int base, int exponent) {
        int i = 1, result = base;
        while (i < exponent) {
            result = result * base;
            i++;
        }
        return exponent == 0 ? 1 : result;
    }

    private static byte[] countArrayFromInt(int i) {
        ArrayList<Byte> C = new ArrayList<>();
        while (i > 1) {
            C.add(0, (byte) (i % 2));
            i = i / 2;
        }
        C.add(0, (byte) (i));

        byte[] resultArray = new byte[C.size()];
        for (int j = 0; j < C.size(); j++) {
            resultArray[j] = C.get(j);
        }
        return resultArray;
    }
}