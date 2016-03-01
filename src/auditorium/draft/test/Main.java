package auditorium.draft.test;

/**
 * Created by Admin on 30.01.2016.
 */
public class Main {

	 static  int number;


	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Worker(), "T_1");
		Thread t2 = new Thread(new Worker(), "T_2");
		System.out.println(t1.getState());
		t1.start();
//		Thread.sleep(1);
		System.out.println(t1.getState());
		t2.start();
		try {
			t1.join();
			t2.join();
			//            Thread.sleep(100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(number);

	}

	public /*synchronized*/ static void increceNumber() {
		number++;
	}


}



