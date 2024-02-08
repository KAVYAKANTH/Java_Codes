class Exception
{
	public static void main(String args[])
	{
		A a = new A();
		a.m1();
		a.m2();
		a.m3();
		a.m4();
	}
}
class A
{
	public void m1()
	{
		System.out.println(10/2);
		System.out.println(" Execution on m1");
		
	}
	public void m2()
	{
		System.out.println(20/3);
		System.out.println(" Execution on m2");
		
	}
	public void m3()
	{
		try
		{
			System.out.println(10/0); // Arithmatic expeception at run time
			System.out.println(" Execution on m3");
		}
		catch(ArithmeticException e)
		{
				System.out.println(10/2);
				System.out.println("caught the exception execution");
				
		}
		
	}
	public void m4()
	{
		System.out.println(30/5);
		System.out.println(" Execution on m4");
	}
}