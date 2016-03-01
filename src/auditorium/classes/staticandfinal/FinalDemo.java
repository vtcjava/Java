package auditorium.classes.staticandfinal;

/**
 * This class demonstrates what is the "final" specifier in java
 * and the rules to declare, initialize and use the "final" variables
 * for static and non static fields.
 *
 */
public class FinalDemo {
    //TODO: final static variable must be initialized
    //TODO: directly on declaration or at list in any static block
    static final int b = 1; //Direct or dynamic initialization
    static final int a;   // you can add here the initialization such as a = 10; or it must be in static block
    // in case when you initialize a directly (static final int a = 10;)
    // You must removeTest the initialization in static block.
    // THE final variables must be initialized in the beginning
    // and then its value can not changed

    static { // THE STATIC BLOCK
//        b = 1;
        System.out.println("in static block : b = " + b);
        a = 7; //TODO: comment or removeTest this if "a" is initialized on declaration, for instance ( static final int a = 5;)
        System.out.println("in static block : a = " + a);
    }

    // HERE ARE NON STATIC FINALs
    final int c = 1;
    final int d;  // must be initialized here directly or in non static block
                         // or at list in constructor
    {  // this is non static block
       System.out.println("in non static block : c = " + c);
       d = 5;
       System.out.println("in non static block : d = " + d);
    }

    public FinalDemo() {
//        this.d = 77; // TODO : uncomment this row and comment initialization in non static block
    }

    public static void main(String[] args) {
        FinalDemo finalDemo = new FinalDemo(); //
        System.out.println("in main :");
    }
}
