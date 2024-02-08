class Overload
{
	public static void main(String[] args)
	{
		A a = new A();
		a.m1(10,20);
		a.m1("Kavya");
		a.m1(30,9492);


	}
}
class A
{
	public void m1(int x , int y)
	{
		//int x=10, y=20;
		//System.out.println("Overload m1");
		System.out.println(x+y);
	}
	public void m1(String s)
	{
		//String s="Kavya";
		System.out.println(s);
	}
	public void m1(int x, long l)
	{
		//int x=30, l=9492;
		//System.out.println("Overload m1");
		System.out.println(x + l);
	}
}
/*class B
{
	public void m1();
	{
		System.out.println("Overload m1");
	}
	public void m2();
	{
		System.out.println("Overload m1");
	}
	public void m2();
	{
		System.out.println("Overload m1");
	}
}*/