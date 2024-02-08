import java.util.*;
import java.util.concurrent.*;

class  CallableThreadPool
{
	public static void main(String[] args)throws InterruptedException, ExecutionException
		{
				//Runnable r = new CustomThread();
				Callable<Object> c = new CustomThread();
				ExecutorService service = Executors.newFixedThreadPool(5);
				//ture f = null;
				for(int i=0; i<15; i++)
				{
					service.submit(c);
					//service.submit(r);

				}

				/*
				while(f.isDone());
				{
					System.out.println("Future Scope is:"+ f.get());
				}	
				*/
			
		}
	}
	class CustomThread extends Thread implements Callable<Object>
	{

			public void run()
			{
				System.out.println("Run Method creating:: " + Thread.currentThread().getName());
			}
			public Integer call()
			{
				System.out.println("call Method creating:: " + Thread.currentThread().getName());
				return null;
				
			}
			
	}

