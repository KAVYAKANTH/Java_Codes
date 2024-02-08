//Custom Thread using Implementing Run()
class CustomThreadImplementsRunnable
{
	public static void main(String[] args)
	{
		Runnable r = new CustomThread();
		Thread t = new Thread(r);
		t.start();
		for(int i=0; i<10; i++)
		{
			System.out.println("Basic thread:: " + Thread.currentThread().getName());
		}
	}

}
class CustomThread implements Runnable
{
	
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Custom thread of Runable::" + Thread.currentThread().getName());;
		}
	}
}