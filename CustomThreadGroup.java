
class CustomThreadGroup{

	public static void main(String[] args)
	{
		ThreadGroup a = new ThreadGroup("Bantu-thread Thread");
		CustomThread t = new CustomThread(a,"Kavya");
		t.start();
		
		
	
	}
}
class CustomThread extends Thread
 {
	
	CustomThread(ThreadGroup a,String name)
	{
		
		super(a,name);
	}
 	public void run()
	{
 		System.out.println("Thread Group::" +Thread.currentThread().getThreadGroup().getName());
 	}
}
 
