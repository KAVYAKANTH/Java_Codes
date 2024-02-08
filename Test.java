class Test
{
	public static void main(String[] args)
	{
		String s1 = " Hello Java Buddy";
		StringBuffer s2 = new StringBuffer();
		String[] s3 = s1.split(" ");
		for(int i=s3.length-1; i>=0; i--)
		{
			s2.append(s3[i]);
		}
		System.out.println(" Reverse string" +s3);
	}
}