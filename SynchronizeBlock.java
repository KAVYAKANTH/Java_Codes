

public class Synchronize{

	public static void main(String[] args)
	{
		Atm atm = new Atm();
		CustomThread t = new CustomThread(atm, "Kavya-Thread");
		t.start();
		
		
	
	}
}
class CustomThread extends Thread
 {
	Atm atm;
	CustomThread(Atm atm, String nm)
	{
		super(nm);
		this.atm=atm;
	}
 	public void run()
	{
 		atm.withdraw();
 	}
}
 
class Atm
{
	public void withdraw()
	{
		synchronized(Atm.class)//class level synchronized
		{
			for(int i=0; i<5; i++)
			{
			//System.out.println("Withdraw Thread by::");
				try
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{

				}
				System.out.println("Waiting Thread by::"+Thread.currentThread().getName()+i);
				
			}

				
		}
		for(int i=0; i<5; i++)
			{
			//System.out.println("Withdraw Thread by");
				try
				{
					Thread.sleep(2000);
				}
				catch(InterruptedException e)
				{

				}
				System.out.println("Class levelThread by"+Thread.currentThread().getName()+i);
			}
				
	}
}

		