class CodereduceVariable
{
	public static void main(String[] args)
	{
		//R a = new A(10, 20, 30, false);
		B b = new B(40,50,60,900.88,00011122);
		C c = new C(70,80,90,true,990909);
		//a.print();
		b.print();
		c.print();
	
	}
}
class Parent
{
	int x;
	int y;
	int z;
	Parent(int x, int y, int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
class R extends Parent
{
	//String s;
	boolean b;
	R(int x, int y, int z, boolean b)
	{
		super(x,y,z);
		//this.s = s;
		this.b = b;
	}
	public void print()
		{
			System.out.println("x = "+x+" y = "+y+" z = "+z+" b = "+b);
		}
	}
}
class B extends Parent
{
	double d;
	long l;
	B(int x, int y, int z,double d,long l)
	{
		super(x,y,z);
		this.d = d;
		this.l = l;
	}
	public void print()
		{
			System.out.println("x = "+x+" y = "+y+" z = "+z+"d = "+d+"l = "+l);

		}
	
}
class C extends Parent
{
	boolean t;
	long p;
	C(int x, int y, int z, boolean t,long p)
	{
		super(x,y,z);
		this.t = true;
		this.p = p;
	}
	
	public void print()
		{
			System.out.println("x = "+x+" y = "+y+" z = "+z+" t = "+t+"p = "+p);
		}
	
}

