package auditorium.draft.test;

/**
 * Created by Admin on 31.01.2016.
 */
public class Worker implements Runnable {
	public Worker() {
	}

	@Override
	public void run() {
		//   System.out.println("Befor: " + Thread.currentThread().getName());

		for (int i = 0; i < 2000; i++) {
			long start = System.currentTimeMillis();
			//      System.out.println(Thread.currentThread().getName() + " : num is " +  Main.number);
			//    System.out.println("" + (System.currentTimeMillis() - start));

			synchronized (Main.class) {
				Main.increceNumber();

			}
		}
		// System.out.println("After: " + Thread.currentThread().getName());
	}
}
