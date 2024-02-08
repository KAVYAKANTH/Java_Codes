import java.util.*;
class TreeSetDesecending //Ascending order
{
	public static void main(String[] args)
	{
		CustomSet c = new CustomSet();
		TreeSet<Integer> t = new TreeSet<>(c);
		t.add(10);
		t.add(30);
		t.add(20);
		t.add(50);
		System.out.println(t);
	
	}
}
class CustomSet implements Comparator<Integer>
{

	@Override
	public int compare(Integer o1, Integer o2) {
		//Ascending order
		if(o2>o1)
		{
			return  -1;//negative
		}
		else if(o1>o2)
		{
			return 1;//positive
		}
		else
		{
			return 0;//equals
		}
		}
		
}