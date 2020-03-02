package stak;

public interface Stak<T> {
	void push(T element);
	 T pop();
	boolean empty();
	boolean full();
	void show();
}
