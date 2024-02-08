//Custom Thread using Extending Thread class
class CustomThreadExtendsThread
{
	public static void main(String[] args)
	{
		CustomThread t = new CustomThread();
		t.start();
		Thread t2 = new CustomThread();
		t2.start();
		for(int i=0; i<10; i++)
		{
			System.out.println("Basic thread:: " + Thread.currentThread().getName());
		}
	}

}
class CustomThread extends Thread
{
	
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Custom thread of java 1::" + Thread.currentThread().getName());;
		}
	}
}