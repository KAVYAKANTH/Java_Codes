//Default Keyword can use to reduce the code duplication and support mutiple inhertance in interface

class JavaEightDefaultKeyword
{
	public static void main(String[] args)
	{
		A a = new A();
		a.m1();
		System.out.println(a);
		
	}
	}

interface I3
{
	
	public default void m1()
	{
		//can use method declaration using default keyword
		for(int i1=0; i1<20; i1++)
		{
			System.out.println("Printing numbers:: " +i1);
		}
	}

}
interface I2
{
	
	public default void m1()
	{
		//can use method declaration using default keyword
		for(int i2=0; i2<20; i2++)
		{
			System.out.println("Printing numbers:: " +i2);
		}
	}

}
class A implements I3,I2
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		I3.super.m1();
	}
	
}