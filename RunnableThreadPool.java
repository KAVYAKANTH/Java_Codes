import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;

class RunnableThreadPool
{
	public static void main(String[] args)
	{
		CustomThread c = new CustomThread();
		ExecutorService Service = Executors.newFixedThreadPool(5);//creating a pool of 5 threads  
		for(int i=0; i<10; i++)
		Service.submit(c);
		
	}
	


}
class CustomThread implements Runnable
{
	public void run()
	{
		System.out.println("Thread Pools:::"+ Thread.currentThread().getName());
	}
} 


