package auditorium.multithreading;


public class SomeClass implements  Runnable {
	String aText;

	public SomeClass(String aText) {
		this.aText = aText;
	}

	public String getAText(){
		return aText;
	}

	public void setaText(String aText) {
		this.aText = aText;
	}

	@Override
	public void run(){
		synchronized (this) {
			System.out.print("[");
			System.out.print(getAText());
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.print("]");
		}
	}



	public static void main(String[] args) throws InterruptedException {
		SomeClass sharedObject = new SomeClass("Hello");

		Thread t1 = new Thread(sharedObject);
		t1.start();
		Thread.sleep(5);
		sharedObject.setaText("Synch");
		Thread t2 = new Thread(sharedObject);
		t2.start();
		Thread.sleep(100);
		sharedObject.setaText("World");
		Thread t3 = new Thread(sharedObject);
		t3.start();




	}


}
