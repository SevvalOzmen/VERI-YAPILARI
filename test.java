
public class test {
	public static void main(String[]args){
		Stack s1 = new Stack(4);
		s1.push(7);
		s1.push("Bartin");
		s1.push(33);
		s1.push("a");
		s1.pop();
		System.out.println(s1.pop());
		System.out.println(s1.pop());
		System.out.println(s1.peek());
	}

}
