class GetclassSimple
{
	public static void main(String[] args)
	{
		A a = new A();
		a.m1();
		Class c = a.getClass();
		System.out.println(c);
	}
}
class A
{
	public void m1()
	{
		System.out.println("Hello");
	}
}