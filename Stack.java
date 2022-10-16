
public class Stack {
	private int top;
	private Object elements[];
	
	Stack(int capacity){
		top = -1;
		elements = new Object[capacity];
	}
	void push (Object data) {
		if(isFull()) {
			System.out.println("Stack dolu");
			return;
		}
		else {
			top++;
			elements[top] = data;
		}
	}
	boolean isFull() {
		return(top+1 == elements.length);
	}
	Object pop() {
		if(isEmpty()) {
			System.out.println("Stack bos");
			return null;
		}
		else {
			Object temp = elements[top];
			elements[top] = null;
			top--;
			return temp;
		}
	}
	boolean isEmpty() {
		return (top == -1);
	}
	int size() {
		return top+1;
	}
	Object peek() {
		if(isEmpty()) {
			System.out.println("Stack bos");
			return null;
		}
		else {
			return elements[top];
		}
	}

}
