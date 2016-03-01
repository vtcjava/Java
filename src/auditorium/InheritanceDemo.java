package auditorium;


public class InheritanceDemo {


    public static void main(String[] args) {

        A var = new B();
        if (var instanceof A) {
            System.out.println("var instanceof A : " + (var instanceof A));
        }
        if (var.getClass().getName().endsWith("B")) {
            System.out.println("var.getClass().getName().equals(\"B\") : ");
        }
        B bObj = (B) var;
        bObj.tmp = 111;
        var.meth();

    }

}

class A {
    int b = 10;

    void meth() {
        System.out.println("In A class");
    }
}


class B extends A {
    int tmp = 16;

    void meth() {
        System.out.println("In B class");
        System.out.println("In B class tmp = " + tmp);

    }
}