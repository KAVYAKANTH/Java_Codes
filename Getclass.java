class Getclass
{
	public static void main(String[] args)
	{
		A a = new A();
		System.out.println(a.hashCode());
		Class c = a.getClass();
		System.out.println(c);
		Child b = new Child();
		b.m1();
		b.m2();
		b.m3();
		System.out.println(b.hashCode());
		Class c1 = b.getClass();
		System.out.println(c1);
		Overload o = new Overload();
		o.m4();
		o.m4(10,2);
		//o.m4(50,100);
		Class c2 = o.getClass();
		System.out.println(c2);
	}
	
}
class A
{
	A()
	{
		System.out.println("Default constructor");
	}
	{
		System.out.println("Instance object");
	}
}
class Bparent
{
	public void m1()
	{
		System.out.println("Getting m1 in Bparent class");
	}
	public void m2()
	{
		System.out.println("Getting  m2 in Bparent class");
	}
}
class Child extends Bparent
{
	public void m1()
	{
		System.out.println("Getting m1 in Child  class");
	}
	public void m3()
	{
		System.out.println("Getting  m3 in Child class");
	}
}
class Overload
{
	public void m4()
	{
		System.out.println("Overloading in M1");
	}
	public void m4(int x ,int p)
	{
		System.out.println("Overloading in M1 and printing m1");
		System.out.println( x + p);
	}
}
