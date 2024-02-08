import java.util.*;

public class LinkedList
{
	public static void main(String[] args)
	{
		LinkedList<Integer> q = new LinkedList<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		System.out.println(q);
		q.element();
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.peek();
		System.out.println(q);		
}
}