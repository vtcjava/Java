package auditorium.classes.staticandfinal;

/**
 * This class demonstrates how dose the java
 * initializes Static fields,
 * 1. when will done direct initialization of fields
 * (this can be done by debugging with breakpoints set on "int a = 1;" line)
 * 2. when will be work a non static block
 * 3. when will be done the statements in main method.
 */
public class StaticFieldsDemo {
    static int a = 1;   // Direct initialization
    static int b;


    static {  // This is static block it must be done before the main method
        // TO check whether "a = 1;" already done
        System.out.println("In Non Static block before 'b = 10;' :  a = " + a);

        // TO check the value of b: if it is 0 then the java already was initialized the b
        System.out.println("In Non Static block before 'b = 10;' :  b = " + b);

        b = 10; // NON Static block initialization

        // TO check the value after initialization of b in static block
        System.out.println("In Non Static block after  b = 10;");
    }

    public StaticFieldsDemo() {
        System.out.println("In Constructor " );
    }

    /**
     * To call the Constructor of this
     *
     * @param args commandline parameters
     */
    public static void main(String[] args) {
        StaticFieldsDemo obj = new StaticFieldsDemo();
        System.out.println("In main method");
    }
}
