package auditorium.multithreading;

public class ThreadDemo {


    public static void main(String[] args) {

        System.out.println(Thread.currentThread()+ "  - state: " + Thread.currentThread().getState());
        //thread by Runnable usage
        SomeRunnable someRunnable = new SomeRunnable();
        Thread t = new Thread(someRunnable, "ByRunnable" );
        System.out.println(t+ "  - state: " + t.getState());
        t.start();

        InheritedThread thread = new InheritedThread();
        thread.start();
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + " : " + i);


        }

        try {
            System.out.println("Before join of " + thread + " state is " + thread.getState());
            thread.join();
            System.out.println("After join of " + thread + " state is " + thread.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread() + " : " + Thread.currentThread().getState());

    }



}

class SomeRunnable implements Runnable {




    @Override
    public void run() {
        System.out.println(Thread.currentThread() +  "  - state: " + Thread.currentThread().getState());
        System.out.println("KUKU");
    }
}

class InheritedThread extends Thread {

    public InheritedThread() {
        this("InheritedThread");
    }

    public InheritedThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread() + " : " + i
                    + "  - state: " + Thread.currentThread().getState());

        }
    }
}
