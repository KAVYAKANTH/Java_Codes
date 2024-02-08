import java.util.*;
class MapHashMap
{
	public static void main(String[] args)
	{
		Map<Integer,String> m = new HashMap<>();
		m.put(1,"Kavya");
		m.put(2,"Lakshmi");
		m.put(3,"Chandu");
		m.put(4,"Bantu");
		m.put(5,"K");
		m.put(6,"L");
		m.put(7,"C");
		m.put(8,"B");
		m.put(9,"D");
		m.put(10,"E");
		m.put(11,"F");
		m.put(12,"G");
		m.put(13,"H");
		m.put(14,"I");
		m.put(15,"J");
		m.put(16,"K");
		m.put(17,"L");
		System.out.println(m);
		m.get(11);
		String name = m.get(16);
		for(Map.Entry<Integer,String> e : m.entrySet())
		System.out.println("Key is: " +e.getKey() +" Value = " +e.getValue());
		
	}
}