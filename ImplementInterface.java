class ImplementInterface
{
	public static void main(String[] args)
	{
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		b.m5();
		b.m6();
	}	
}
interface I
{
	public abstract void m1();
	public abstract void m2();
	public abstract void m3();
}
interface I2 extends I
{
	void m4();
	void m5();
	void m6();
}
class B implements I2
{
	public void m1()
	{
		System.out.println("Implementing m1");
	}
	public void m2()
	{
		System.out.println("Implementing m2");
	}
	public void m3()
	{
		System.out.println("Implementing m3");
	}
	public void m4()
	{
		System.out.println("Implementing m4");
	}
	public void m5()
	{	
		System.out.println("Implementing m5");
	}
	public void m6()
	{	
		System.out.println("Implementing m6");
	}
}

