package auditorium.exception;

/**
 * Company: WeDooApps
 * Date: 11/29/15
 * <p>
 * Created by Adam Madoyan.
 */

public class ExceptionDemo {


    public static void main(String[] args) {

//        try {
            String s = calculate();
            System.out.println(s);
//        } catch (ArithmeticException e) {
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }

    }

    static int divide(int a, int b, int[] arr, int index)
         throws MyException{

        if (arr == null) {
            throw new MyException("arr is null. ");
        }

        if (b == 0) {
            throw new ArithmeticException("Divide by zero!!!!!!!");
        }

        if (arr.length <= index) {
            throw new ArrayIndexOutOfBoundsException("index out of array size.");
        }

        return a / b;
    }


    public static String calculate() {
        String result = "res = ";
        try {
            result += String.valueOf(divide(7, 10, null, 3));
        } catch (Exception e) {
            result = null;
            return result;
        } finally {
            result = "close";
            return result;
        }
    }

}

class A {

    public static void main(String[] args) {
        A a = null;
        try {
            a = new B();

        } catch (Throwable e) {
            e.printStackTrace();
        }

        try {
            a.m();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    A () throws Exception {
    }

    void m () throws Exception{
    }
}
class B extends A {

    B () throws Throwable {
        throw new Exception();

    }

    void m ()  {

    }
}
