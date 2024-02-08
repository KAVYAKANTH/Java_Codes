class MultipleInterface
{
	public static void main(String[] args)
	{
		Multiple m = new Multiple();
		m.m1();
		m.m2();
		m.m3();
	}
}
interface I
{
	public void m1();
	public void m2();
	public void m3();
}
interface I2 
{
	public void m3();
	//function interface.
}
interface I3 extends I2 
{
	//marker interface with no method declaration.
}
class Multiple implements I,I3
{
	public void m1()
	{
		System.out.println("Interface in M1");
	}
	public void m2()
	{
		System.out.println("Interface in M1");
	}
	public void m3()
	{
		System.out.println("Interface in M3 overides and print the result");
	}
}


