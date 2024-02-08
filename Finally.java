class Finally
{
	public static void main(String[] args)
	{
		A a = new A();
		a.m1();
		a = null;
		System.out.println("Assign null to object refernce");
		System.gc();
	}
	
}
class A
{
	public void m1()
	{
		System.out.println("Hello Java");
	}
	public void finalize()
	{
	//to perform clean-up activity on deamon thread(Garbage collector, JVM will mark and sleep the null storage.

		System.out.println("Cleaning in fianlly block");

	}
}

