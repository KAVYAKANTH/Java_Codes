//error in the program
class StringBuffer
{
	public static void main(String[] args)
	{
		String s1 = new String("Hello");
		String s2 = new String("Java");
		String s3 = new String("Hello");
		String s4 = s1.concat("Peoples");
		String s5 = s4.concat("Overides the equals");
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1==s3);
		System.out.println(s3==s4);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1.equals(s5));
		System.out.println(s1.equals(s4));
		System.out.println(s1.hashCode()+"---"+s2.hashCode()+"---"+s3.hashCode()+"---"+s4.hashCode()+"---"+s5.hashCode());


		StringBuffer br = new StringBuffer("Appending");
		System.out.println(br);
		










	}
}