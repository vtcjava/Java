package auditorium.multithreading;

//       [Hello]
//       [World]
//       [Synchronized]

public class SynchDemo {
    public static void main(String args[]) throws InterruptedException {

        Printer printer = new Printer();

        Caller ob1 = new Caller(printer, "Hello");
        Caller ob2 = new Caller(printer, "Synchronized");
         Thread.sleep(2);
        Caller ob3 = new Caller(printer, "World");

        try {
            ob1.t.join();
            ob2.t.join();
            ob3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
        }
    }
}


// This program is not synchronized.
class Printer {

    synchronized void print(String msg) throws InterruptedException{
        System.out.print("[" + msg);
        Thread.sleep(1);

        System.out.println("]");
    }
}

class Caller implements Runnable {
    String msg;
    Printer printer;
    Thread t;

    public Caller(Printer targ, String s) {
        printer = targ;
        msg = s;
        t = new Thread(this);
        t.start();
    }

    public void run() {
        try {
           // synchronized (printer){
                printer.print(msg);
         //   }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
