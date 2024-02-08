
class Hashcode
{
	public static void main(String[] args)
	{
	
		A a = new A(); // to check unique id of the ogbject
		A a1 = new A();
		A a2 = new A();
		a.m1();
		a.m2();
		a.m3();
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		System.out.println(a2.hashCode());
	}
}
class A
{
	public void m1()
	{
		System.out.println("Hashcode object class printing m1");
	}
	public void m2()
	{
		System.out.println("Hashcode object class printing m2");
	}
	public void m3()
	{
		System.out.println("Hashcode object class printing m3");
	}
	public void m4()
	{
		System.out.println("Hashcode object class printing m4");
	}
}