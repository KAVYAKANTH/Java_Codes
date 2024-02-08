class BooleanEqualsTo
{
	public static void main(String[] args)
	{
		
		String s1 = new String("anjali");
		String s2 = new String("anjali");
		System.out.println(s1==s2); // refernce comparision
		System.out.println(s1.equals(s2)); // need to overide content comparision
	} 
}

