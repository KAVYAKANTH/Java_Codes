//error is there

class  HashcodeusingConstructor
{
	public static void main(String[] args)
	{
		B b = new B(false);
		B b1 = new B();
		B b1 = new B(9,"kavya");
		B b1 = new B(5, 88.22);
		
		System.out.println(b.hashCode());
		System.out.println(b1.hashCode());
		
	}
		
}
class A
{
	A()
	{
		System.out.println("Hello default constructor");
	}
	A(int a , String s)
	{
		//int x = 10;
		System.out.println( x * 2);
		//String s = "Kavyanjali";
		System.out.println(s);
		
	}
}
class B extends A
{
	B(boolean b)
	{
		System.out.println(b);
	}
	B(int y , double d)
	{
		//int y = 20;
		//double d = 34445.009;
		System.out.println(y * 10 -4);
		System.out.println(d);
		
	}
}
