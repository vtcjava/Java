package auditorium.draft;

public class Singleton {
//	private static Singleton instance; // = new Singleton();
	static {
	System.out.println("In static Singletone ");
}
	static void m(){
		System.out.println("In m method");
	}

	private Singleton(){}

//	public static Singleton getInstance(){
//		if(instance == null) {
//			synchronized(Singleton.class) {
//				if(instance == null) {
//					instance = new Singleton();
//				}
//			}
//		}
//		return instance;
//	}

	public static class InstanceInitializer{

		private static Singleton instance ;
		static {
			System.out.println("In static BLOCK = " + instance);
			instance = new Singleton();
		}

		public static Singleton getInstance(){
			return instance;
		}
	}
}
