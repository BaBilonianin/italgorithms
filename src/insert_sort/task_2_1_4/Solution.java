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
//        byte[] A = new byte[]{1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0};
//        byte[] B = new byte[]{1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0};
        byte[] A = new byte[]{1, 0, 0};
        byte[] B = new byte[]{1, 0, 0};
        ArrayList<Byte> C = new ArrayList<>();

//        completeTask(A, B);
        testGetPow();
        testCountArrayFromInt();
        testCountIntFromArray();
    }

    private static void testGetPow() {
        System.out.print(getPow(1,2));
        System.out.print(getPow(2,3));
        System.out.print(getPow(2,4));
        System.out.print(getPow(2,5));
        System.out.print(getPow(2,7));
    }

    private static void testCountIntFromArray() {
        countArrayFromInt()
    }

    private static void testCountArrayFromInt() {
        countArrayFromInt(5,)
    }

    private static void completeTask(byte[] a, byte[] b) {
        int intA = countIntFromArray(a);
        int intB = countIntFromArray(b);
        printResults(countArrayFromInt(intA + intB,a.length));
    }

    private static void printResults(boolean b,ArrayList<Byte> C) {
        if (b) {
            for (byte c : C) {
                System.out.print(c);
                System.out.print(" ");
            }
            System.out.print("\n");
        } else System.out.println("C length don't = A.length + 1");
    }

    private static boolean countArrayFromInt(int i, int length,ArrayList<Byte> C) {
        C.clear();
        while (i > 1) {
            C.add(0, (byte) (i % 2));
            i = i / 2;
        }
        C.add(0, (byte) (i));
        return C.size() == length + 1;

    }

    private static int countIntFromArray(byte[] a) {
        int result = 0;
        for (int i = a.length-1; i > -1; i--) {
            result = a[i] == 0 ? result : result + getPow(2, i+1);
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


}