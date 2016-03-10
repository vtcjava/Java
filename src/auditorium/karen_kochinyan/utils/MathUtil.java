package auditorium.karen_kochinyan.utils;

/**
 * Encapsulates the mathematical functions
 */
public class MathUtil {

    public static void main(String[] args) {
        int a = -1;
//        System.out.println(a>>2);
//        System.out.println((a>>>1)== Integer.MAX_VALUE);

//        System.out.println(factorial(49));
//        System.out.println(factorialByRecursion(49));
//
//        printIntAsBinary(8789267254022766592l);

    }

    /**
     * Returns the value of the first argument raised to the power of the
     * second argument, such that a > 0 and n > 0.
     *
     * @param a the base
     * @param n the exponent
     * @return the value <code>a<sup>b</sup></code>.
     */
    public static int pow(int a, int n) {
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= a; // res = res * a;
        }
        return res;
    }

    public static int powByRecursion(int a, int n) {
        return (n < 1) ? 1 : a * powByRecursion(a, n - 1);
    }

    /**
     * Calculates and returns Greatest common divisor
     *
     * @param x
     * @param y
     * @return gcd of specified x and y numbers
     */
    public static int gcd(int x, int y) {
        while (x % y != 0) {
            int tmp = y;
            y = x % y;
            x = tmp;
        }
        return y;
    }

    public static int gcdByRecursion(int x, int y) {
        if (x % y == 0) {
            return y;
        }
        return gcdByRecursion(y, x % y);
    }

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static long factorial(long n) {
        long res = 1;
        if (n == 0 || n == 1) {
            return res;
        }

        for (long i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    public static long factorialByRecursion(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return factorialByRecursion(n - 1) * n;
    }


    /**
     * Calculates and returns the absolute value
     * of specified n number
     *
     * @param n specified number to find the absolute number
     * @return absolute number of specified n
     */
    public static int abs(int n) {
        return n > 0 ? n : -n;

    }

    public static int reverse(int number) {
        int res = 0;

        while (number != 0) {
            res = res * 10 + number % 10;
            number /= 10;
        }

        return res;
    }

    public static void printIntAsBinary(long n) {
        for (int i = 63; i >= 0; i--) {
            System.out.print((n >> i & 1));

        }
        System.out.println();
    }
}






