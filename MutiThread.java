class MutiThread
{
	public static void main(String[] args)
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Basic thread" + Thread.currentThread().getName());
		}
		for(int i=0; i<10; i++)
		{
			System.out.println("Basic thread of java 1" + Thread.currentThread().getName());;
		}

	}
}
