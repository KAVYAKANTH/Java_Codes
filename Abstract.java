class Abstract
{
	public stactic void main(String[] args)
	{
		B b = new B();
		b.m1();
		b.m2();
		b.m3();
		b.m4();
	}
}
abstract class A
{
	public void m1()
	{
		System.out.println("Abstract in concrete m1");
	}
	public abstract void m2();
	public abstract void m3();
	public void m4()
	{
		System.out.println("Abstract in concrete m4");
	}
}
class B extends class A 
{
	public void m2()
	{
		System.out.println("concrete extends m4");
	}
	public void m3()
	{
		System.out.println("concrete extends m3");
	}	
}