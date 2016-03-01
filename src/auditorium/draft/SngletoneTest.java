package auditorium.draft;

/**
 * Created by karenvardanyan on 2/29/16.
 */
public class SngletoneTest {

	public static void main(String[] args) {
		Singleton.m();
		Singleton singleton = Singleton.InstanceInitializer.getInstance();
		Singleton singleton2 = Singleton.InstanceInitializer.getInstance();

	}
}
