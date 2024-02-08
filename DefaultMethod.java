import java.util.*;
class DefaultMethod
{
	public static void main(String[] args)
	{
		TreeSet<Integer> t = new TreeSet<>((i1,i2)->i1-i2);
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		System.out.print(t);
		
		
	}

}