final class Finalclass
{
	public static final void main(String[] args)
	{
	
		
		float f = 22.1f;
		int i =20;
		B a = new B();
		a.m1();
		a.m2();
	}

}

final class A
{
	public final void m1()
	{
		int i =20;
		System.out.println(i * 10);
		//m2();
	}
}
final class B
{
	public final void m2()
	{
		final int x = 10;
		int z = 5;
		int i =20;
		System.out.println(x + i);
		System.out.println(x - z);
	}
	
}