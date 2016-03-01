package auditorium.classes.staticandfinal;

/**
 * This class demonstrates how dose the java
 * initializes NON Static fields,
 *   1. when will done direct initialization of fields
 *      (this can be done by debugging with breakpoints set on "int a = 1;" line)
 *   2. when will be work a non static block
 *   3. when will be statements in Constructor.
 */
public class NonStaticFieldsDemo {
    int a = 1;   // Direct initialization
    int b;

    {
        // TO check whether "a = 1;" already done
        System.out.println("In Non Static block before 'b = 10;' :  a = " + a);

        // TO check the value of b: if it is 0 then the java already was initialized the b
        System.out.println("In Non Static block before 'b = 10;' :  b = " + b);

        b = 10; // NON Static block initialization

        // TO check the value after initialization of b in non static block
        System.out.println("In Non Static block after  b = 10;");
    }

    public NonStaticFieldsDemo(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("In Constructor after initialization;' :  a = " + this.a);
        System.out.println("In Constructor after initialization;' :  b = " + this.b);
    }

    /**
     * To call the Constructor of this
     * @param args  commandline parameters
     */
    public static void main(String[] args) {
        NonStaticFieldsDemo obj = new NonStaticFieldsDemo(7, 7);


    }
}
