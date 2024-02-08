// writing a program of abstract and interface method(using final keyword)
class InterfaceNocons
{
	public static void main(String[] args)
	{
		B b = new B();
		b.m1(10);
		b.m2();
		b.m3();
		b.m4();
		R r = new R();
		r.c1();
		r.c2();
		r.c3();
		
		
	}
}
abstract class A
{	
	int x; // Instance object intilization
	public void m1( int x)
	{	
		System.out.println("Creating Instance variable & Printing value");
		System.out.println(x);
	}
	public abstract void m2();
	protected abstract void m3();
	abstract void m4(); //incresing the scope
	
}
class B extends A
{
	public void m2()
	{	
		
		System.out.println("Extending in child class M2");
	}
	public void m3()
	{	
		
		System.out.println("Extending in child class M3");
	}
	public void m4()
	{	
		
		System.out.println("Extending in child class M4");
	}
	
}
interface I 
{
	final int x = 10;
	public void c1();
	public void c2();
}
interface I2 extends I
{
	public void c3();
}
class R implements I2
{
	
	public void c1()
	{
		System.out.println("Interface printing the static value");
		System.out.println(x);
	}
	public void c2()
	{
		System.out.println("Interface calling c2");
	}	
	public void c3()
	{
		System.out.println("Interface calling c3");
	}
	
}
