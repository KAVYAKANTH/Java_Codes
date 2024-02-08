import java.util.concurrent.*;
class Deadlocks
{
	public static void main(String[] args)
	{
		A a = new A();
		B b = new B();
		Thread t1 = new CustomThread1(a,b);
		t1.start();
		Thread t2 = new CustomThread2(a,b);
		t2.start();	
	}
}
class CustomThread1 extends Thread
{
	A a;
	B b;
	CustomThread1(A a, B b)
	{
		this.a = a;
		this.b = b;
	}
	public void run()
	{
		a.m1(b);
	}	
}
class CustomThread2 extends Thread
{	
	A a;
	B b;
	CustomThread2(A a, B b)
	{
		this.a = a;
		this.b = b;
	}
	public void run()
	{
		b.m2(a);
	}
}

class A
{
	public synchronized void m1(B b)
	{
		System.out.println("Thread 1 running m1");
		b.m4();
	}
	public synchronized void m3()
	{
		System.out.println("Thread 3 running m3");
	}
}
class B
{
	public synchronized void m2(A a)
	{
		System.out.println("Thread 2 running m2");
		a.m3();
	}
	public synchronized void m4()
	{
		System.out.println("Thread 4 running m4");
	}

}
/*Implenting lock method to comeout from the waiting state.
class C
{
		ReentrantLock lock = ReentrantLoc();
		public void action()
		{
        		reentrantlock.lock();
        		try
        		{
            			System.out.println("Lock has acquired"+Thread.currentThread().getName());
				Thread.sleep(2000);
        		}
        		catch(Exception e)
        		{
            			e.printStackTrace();
       			 }
        		finally
        		{
            			reentrantlock.unlock();
        		}
         

}
class CustomThread3 extends Thread
{	
	C c;
	CustomThread3(String name, C c)
	{
		super(name);
		this.c = c;
	}
	public void run()
	{
		c.action();
	}
}
*/
