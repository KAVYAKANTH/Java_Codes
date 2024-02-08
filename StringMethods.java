//String overides equals();

class StringMethods
{
	public static void main(String[] args)
	{
		String s1 = new String("Kavyanjali Kanth Anjali");
		String s2 = "anjali";
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode()+"  "+ s2.hashCode());
		System.out.println("----------------------");

		//equalsIgnoreMethod
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println("----------------------");


		//splitmethod
		String arr[] = s1.split(" ");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
			System.out.println("----------------------");
		}
		
		//reverse split
		String[] arry=s1.split(" ");
		for(int i=arry.length-1;i>=0; i--)
		{
			System.out.println(arry[i]);
			System.out.println("-----------Reverse Split****-----------");
		}

		for(int i=arry.length-1; i>=0; i--)
		{
			System.out.println(s2.charAt(i));
			System.out.println("-----------Reverse words-----------");
		}

		//character array
		char ChArr[] = s1.toCharArray();
		for(int i=0; i<ChArr.length; i++)
		{
			System.out.println(ChArr[i]);
		}
		
		//substring
		System.out.println(s1.substring(11,17));
		

		
		
	}
}
