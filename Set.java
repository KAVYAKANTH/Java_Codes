import java.util.*;

class Set
{
	public static void main(String[] args)
	{
		Set<String> s = new HashSet<>();
		s.add("Kavya");
		s.add("Bantu");
		s.add("Chandu");
		s.add("Lakshmi");
		s.add("Chandu"); //duplication in string
		System.out.println(s);
		s.add("Java");
		System.out.println(s);
				
	}
}