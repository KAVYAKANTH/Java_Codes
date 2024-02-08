/* 
1. To make Mutable string to Immutable String
2. class should be declared as final
3. Methos should declared as private and final keyword.
4. Should not use getter method
5. Should use Constructor method
6. Main[Logic] = Deep copy(Make use of existing object refernce the copy the existing data and pass to new object)
*/



class ImmutableToMutable
{
	public static void main(String[] args)
	{

		B b1 = new B();
		A a = new A(400,b1);
		System.out.println("Before changing mutable");
		System.out.println("In class " +a);
		System.out.println("In class " +b1);
		System.out.println("After changing Immutable");
		b1.setY(30);
		System.out.println("In class " +a);
		System.out.println("In class " +b1);
	}	
}
final class A
{
	private final int x;
	private final B b1;
	A(int x , B b1)
	{
		this.x=x;
		B b2 = new B();
		this.b1=b2;
	}
	public int getX()
	{
		return x;
	}
	public String toString()
	{
		return "x = "+x+"  "+b1;
	}
}
class B
{
	int y =20;
	public void setY(int y)
	{
		this.y=y;
	}
	public int getY()
	{
		return y;
	}
	public String toString()
	{
		return "y = "+y;
	}
}

