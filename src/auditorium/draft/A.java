package auditorium.draft;

/**
 * Company: WeDooApps
 * Date: 11/29/15
 * <p>
 * Created by Adam Madoyan.
 */
public class A {


    public static void main(String[] args) throws CloneNotSupportedException {


        A a = new A();

        A a1 = (A) a.clone();


        System.out.println(a == a1);

        System.out.println(a.equals(a1));

    }



    int i = 45;

    B b = new B();


    final void test() {
        System.out.println("test");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {


        A a = new A();

        a.i = this.i;

        a.b = (B) this.b.clone();

        return a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a = (A) o;

        return i == a.i;

    }

//    @Override
//    public int hashCode() {
//        return i;
//    }
}


class B {
    int b = 65;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        B b = new B();
        b.b = this.b;
        return b;
    }
}

class C extends A {


//    @Override
//    void test() {
//        super.test();
//    }
}