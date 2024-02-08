import java.util.*;


public class Queue
{
	public static void main(String[] args)
	{
		Queue<Integer> q = new PriorityQueue<>();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		System.out.println(q);
		q.remove();
		System.out.println(q);
		q.removeAll(q);
		System.out.println(q);
		q.add(21);
		System.out.println(q);
		q.poll();
		System.out.println(q);
		
		
}
}
//it works correctly in eclipse.