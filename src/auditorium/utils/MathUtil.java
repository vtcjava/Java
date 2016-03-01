package auditorium.utils;

/**
 * Encapsulates the mathematical functions
 */
public class MathUtil {

    public static void main(String[] args) {
        System.out.println(reverse(-12));
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

    /**
     * Calculates and returns the factorial of specified n number
     *
     * @param n the number factorial of which must be calculated
     * @return calculated number
     */
    public static int factorial(int n) {
        int res = 1;

        for (int i = 2; i < n; i++) {
            res *= i;
        }
        return res;
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

    public void printIntAsBinary(int n) {
        // TODO implement
    }
}




