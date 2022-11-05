import java.util.Stack;
import java.util.*;
import java.util.Stack;
import java.util.Scanner;
import java.util.Iterator;

/*public class stack {
	public static void main(String args[]) {
		runIntegerStackTest();
	}
public static void runIntegerStackTest(){
		Stack<Integer> integerStack = new Stack<Integer>();
		while (true) {
			System.out.println();
			System.out.println("****************************");
			System.out.println("Bir secim yapiniz: ");
			System.out.println("1 -- Stack'e bir tamsayi ekle");
			System.out.println("2 -- Stack'ten bir oge sil");
			System.out.println("3 -- Stack'i yazdir");
			System.out.println("4 -- Cýkýs");
			Scanner in = new Scanner(System.in);
			Integer input = in.nextInt();
			System.out.println("Seçiminiz: " + input);
			System.out.println();
			System.out.println("****************************");
			System.out.println();
			
			if (input == 1) {
				System.out.println("Bir tamsayi giriniz: ");
				Scanner pushIn = new Scanner(System.in);
				Integer toPush = pushIn.nextInt();
				integerStack.push(toPush);
				System.out.println("Girilen: \"" + toPush + "\" push() ile girildi.");
				
			} 
			else if (input == 2) {
			
				System.out.println("Oge: \"" + integerStack.pop() + "\" Stack'in ustunden alindi");
			} 
			else if (input == 3) {
				System.out.println("Yaz");
				System.out.println("Uzunluk:=" + integerStack.size());
				for (int i = integerStack.size(); i > 0; i--) {
					System.out.println("****\t" + integerStack.elementAt(i - 1) + "******");
				}
			} 
			else if (input == 4) {
				System.out.println("Hosca kal!!!");
				System.exit(0);
			} 
			else {
				System.out.println("Gecersiz secim");
			}
		}
	}

	
}
*/

/*
 public class stack {
	public static void main(String[] args) {
		Stack s = new Stack();
		String str = "kalas yok kutuk koy salak";
		char ch;
		boolean flag = true;
		int len = str.length() / 2;
		for (int i = 0; i < len; i++)
			s.push(str.charAt(i));
		if (str.length() % 2 == 1)
			len++;
		for (int i = len; i < str.length(); i++) {
			ch = (Character) s.pop();
			if (ch != str.charAt(i))
				flag = false;
		}
		if (flag)
			System.out.println("PALINDROME");
		else
			System.out.println("NOT PALINDROME");
	}
}
*/

/* public class stack {
	public static void main(String[] args) {
		Stack s = new Stack();
		String str = "Sevval";
		for (int i = 0; i < str.length(); i++)
			s.push(str.charAt(i));
		while (!s.isEmpty())
			System.out.print(s.pop());
	}
} */
