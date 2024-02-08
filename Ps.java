class Ps
{
	public static void main(String[] args)
	{
		String s1 = " Hello Java Buddy";
		StringBuffer sb=new StringBuffer();
		String[] arr = s1.split(" ");
		for(int i=arr.length-1; i>=0; i--)
		{
			sb.append(arr[i]);
		}
		System.out.println(" Reverse string" +sb);
	}
}