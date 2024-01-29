class AbstractInterface
{
	public static void main(String[] args)
	{
		C b = new C();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
		D d = new D();
		d.m5();
		d.m6();
		d.m7();
	}
}
abstract class A
{
	public void m1()
	{
		System.out.println("Printing abstract class m1");
	}
	public void m2()
	{
		System.out.println("Printing abstract class m2");
	}
	public abstract void m3();
	public abstract void m4();
}

class C extends A
{
	public void m3()
	{
		System.out.println("Printing abstract class m3");
	}
	public void m4()
	{
		System.out.println("Printing abstract class m4");
	}
	
		
}

interface I 
{	
	void m5();
	public void m6();
	
}
interface I2 extends I
{	
	void m7();
}
class D implements I2
{
	public void m5()
	{
		System.out.println("Printing abstract class m5");
	}
	public void m6()
	{
		System.out.println("Printing abstract class m6");
	}
	public void m7()
	{
		System.out.println("Printing abstract class m7");
	}
	
}
