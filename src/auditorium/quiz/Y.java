package auditorium.quiz;

class Y {
    public Y() {
        System.out.print("Y");
    }
}

class Z {
    public Z(int r) {
        System.out.print("Z");
    }
}

class X extends Z {
    private Y m_objY = new Y();

    public X() {
        super(7);
        System.out.print("X");
    }

    public static void main(String[] args) {

        Thread t1 = new Thread();
//        X x = new X();
        String a = new String("Hello");
        String b = new String("Hello");
        String c = a;
        String d = "Hello";
        String t = "Hello";
        System.out.println(d == t);
        System.out.println(d == "Hello");
        System.out.println(a == "Hello");
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));
    }
}