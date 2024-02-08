class JavaEightStaticMethod
{
	public static void main(String[] args)
	{
		K k = (x,y)->System.out.println(x+y);
		k.add(10,90);
		M m = new M();
		K k1 = m::add;
		k1.add(80,50);
		
	}

}

interface K
{

	public void add(int x, int y);
	
	
}

class M
{
	public void add(int x, int y)
	{
		System.out.println(x+y);
	}
}











/*interface I
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
	
}*/

