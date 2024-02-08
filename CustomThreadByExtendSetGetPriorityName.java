 class CustomThreadByExtendSetGetPriorityName
{
	public static void main(String[] args)
	{
		Thread.currentThread().setPriority(9);
		Thread.currentThread().setName("Main Thread ");
		Thread t = new CustomThread();
		t.setName(" Bantu Thread :");
		t.setPriority(4);
		t.start();

		CustomThread t2 = new CustomThread();
		t2.setName(" Anjali Thread :");
		t2.setPriority(6);
		t2.start();

		for(int i=0; i<5; i++)
		{
			System.out.println("Basic thread:: " + Thread.currentThread().getName() +"  Priority is :" + Thread.currentThread().getPriority());
		}
	}

}
class CustomThread extends Thread
{
	
	public void run()
	{
		
		for(int i=0; i<2; i++)
		{
			System.out.println("Custom thread of java 1::" + Thread.currentThread().getName()+"Priority is :" + Thread.currentThread().getPriority());
		}
		
	}
		
}
class CustomThread2 extends Thread
{
	
	public void run()
	{
		for(int i=0; i<3; i++)
		{
			System.out.println("Custom thread22 of java 22::" + Thread.currentThread().getName()+"Priority is :" + Thread.currentThread().getPriority());
		}
	}
}