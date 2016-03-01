package auditorium.hayk_kupalyan.dynamicarray;

import java.util.*;

class ArrayUtil {
    /**
     * Creates an array filled with random values.
     *
     * @param length the length of the array
     * @param n      the number of possible random values
     * @return an array filled with length numbers between 0 and n-1
     */
    public static int[] randomIntArray(int length, int n) {
        int[] a = new int[length];
        Random generator = new Random();

        for (int i = 0; i < a.length; i++) {
            a[i] = generator.nextInt(n);
        }

        return a;
    }


    /**
     * Prints all elements in an array.
     *
     * @param  a the array to print
     */
    public static void print(int[] a) {
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
      
