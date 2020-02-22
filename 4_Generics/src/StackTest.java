public class StackTest {
  public static void main(String[] args) throws IStack.MyEmptyStackException {
    IStack<Integer> myStack = new Stack<>();
    myStack.push(123);
    myStack.push(99);
    myStack.push(4444);

    System.out.println("Integer stack: " + myStack);
  
    while (!myStack.empty()) {
        Object value = myStack.pop();
        System.out.printf("popped: %d\n", value);
    }

    System.out.println("Empty stack: " + myStack);
	
    // pop fra tom stak
    try {
	    Object value = myStack.pop();
	    System.out.println(value);
	}
	catch (IStack.MyEmptyStackException e) {
		System.out.println(e.getMessage());
	}
  }
}
