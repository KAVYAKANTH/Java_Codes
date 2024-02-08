import java.util.Stack;

public class Stack
{
	public static void main(String[] args)
	{
		Stack<Integer> s = new Stack<>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		System.out.println("Instertion of Element: FILO");
		System.out.println(s);
		System.out.println("Deletion of Element of Element: FILO");
		s.pop();	
		System.out.println(s);
		System.out.println("Peek element");
		s.peek();
		System.out.println(s);
		
		
}
}