import java.util.*;
//arrayList
class Collection
{
	public static void main(String args[])
	{
		ArrayList l = new ArrayList();
		l.add("Integer value");
		l.add(10);
		l.add("Float value");	
		l.add(20.5f);
		l.add("Double value");
		l.add(44.676);
		l.add("String value:");
		l.add(" Kavyanjali");
		l.add("Bool value");
		l.add(false);
		System.out.println(l);


		//creating arrraylist for specific type
		ArrayList<String> ar = new ArrayList<>();
		ar.add("Hello Arraylist in collection");
		ar.add("Collection started in 2023");
		System.out.println(ar);

		//Auto-unboxing
		int a = 100;
		Integer i = Integer.valueOf(a);
		System.out.println(a);

	}
}
