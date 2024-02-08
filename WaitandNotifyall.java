//wait&notifyall
class WaitandNotifyall {

	public static void main(String[] args)
	{
		
		Atm atm = new Atm();
		CustomThread t = new CustomThread(atm, "Kavya-Thread");
		t.start();
		
		BankThread t1 = new BankThread(atm, "LakshmiKanth-Thread");
		t1.start();
		
		
	
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

class BankThread extends Thread
 {
	Atm atm;
	BankThread(Atm atm, String nm)
	{
		super(nm);
		this.atm=atm;
	}
 	public void run()
	{
 		atm.deposit();
 	}
}
 
class Atm
{
	public void withdraw()
	{
		synchronized(this)//class level synchronized
		{
			
			
			//System.out.println("Withdraw Thread by::");
				try
				{
					this.wait();
				}
				catch(InterruptedException e)
				{

				}
				for(int i=0; i<5; i++)
				{
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{

				}
				System.out.println("Withdraw Thread by::"+Thread.currentThread().getName()+i);
				}
			
				
			}

				
		
	}
	public void deposit()
	{
		
			
			for(int i=0; i<5; i++)
			{
			//System.out.println("Withdraw Thread by::");
				try
				{
					Thread.sleep(100);
				}
				catch(InterruptedException e)
				{

				}
				System.out.println("Deposit Thread by::"+Thread.currentThread().getName()+i);
				
			}
			synchronized(this)//class level synchronized
			{
				this.notify();
				
			}
	}
}

		