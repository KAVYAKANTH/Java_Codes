class JavaEightStaticMethod
{
	public static void main(String[] args)
	{
		A a = new A();
		a.m1(); // it can inherite in the child class, can call any interface on other class
		a.m2();
		I.m3();
	}

}
interface I
{
	public void m1();
	public default void m2()
	{
		System.out.println("Hello default method");
	}
	public static void m3()
	{
		System.out.println("Static Method");
	}
}
class A implements I
{

	public void m1()
	{
		System.out.println("Implementation interface");
	}
	
}

