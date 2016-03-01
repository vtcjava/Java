package auditorium.quiz;

/**
 * Created by User on 20.12.2015.
 */

abstract class A {
    int a = 8;
    public A(){
        System.out.println(a);
        show();
    }
    abstract void show();
}

class B extends A {

    int a = 90;

    public B() {
        super();
        System.out.println("In B constructor");
    }

    @Override
    void show() {
        System.out.println(a);
    }
}


public class AbstractClassSample {
    public static void main(String[] args) {
        new B();
    }
}
