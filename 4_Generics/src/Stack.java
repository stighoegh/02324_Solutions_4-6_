
import java.util.LinkedList;
import java.util.NoSuchElementException;


public class Stack<E> implements IStack<E> {
	// LinkedList i stedet for List for at give mulighed
	// for at anvende metoderne addFirst() og removeFirst()
    private LinkedList<E> theStack;

    public Stack() {
		theStack = new LinkedList<E>();
	}

	public void push(E elem) {
		theStack.addFirst(elem);
	}

	/**
	 * Henter og fjerner det øverste element fra stakken
	 * @return det øverste element fra stakken
	 * @throws MyEmptyStackException (checked exception)
	 *         hvis stakken er tom
	 */
	public E pop() throws MyEmptyStackException {
		E element;
		try {
			element = theStack.removeFirst();
			return element;
		}
		catch (NoSuchElementException e) {
			throw new MyEmptyStackException("Pop fra tom stak");
		}
	}

	public boolean empty() {
		return theStack.size() == 0;
	}

	public String toString() {
		return theStack.toString();
	}
}
