

interface   IStack<E> {
  void push(E elem);
  E pop() throws MyEmptyStackException;
  boolean empty();
  
  class MyEmptyStackException extends Exception {

		public MyEmptyStackException(String text) {
			super(text);
		}
	}
}
