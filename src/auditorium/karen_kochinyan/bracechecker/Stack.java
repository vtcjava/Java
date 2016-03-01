package auditorium.karen_kochinyan.bracechecker;


public interface Stack <T> {

	void push(T v);

	T    pop();

	boolean isEmpty();

	void reset();
}
