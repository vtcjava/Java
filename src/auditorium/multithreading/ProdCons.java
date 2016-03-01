package auditorium.multithreading;



public class ProdCons {
    public static void main(String args[]) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press Control-C to stop.");
    }
}

// An incorrect implementation of a producer and consumer.
class Q {
    int n;
    boolean isValueSet;

     synchronized int get() {
         while(!isValueSet){
             try {
                 wait();
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }

        isValueSet=false;
        System.out.println("Got: " + n);
        notify();
        return n;

    }

    synchronized void put(int n) {
         while(isValueSet){
             try {
                 wait();
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }

        this.n = n;
        isValueSet=true;
        System.out.println("Put: " + n);
        notify();

    }
}

class Producer implements Runnable {
    Q q;

    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (true) {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            q.put(i++);

//            try {synchronized ()
//                wait();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }
    }
}

class Consumer implements Runnable {
    Q q;
    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        while (true) {
            q.get();
        }
    }


}

