// can create our own exception using custom exception using constructor.
class CustomException
{
	public static void main(String[] args)throws InvalidNoException
	{
		ValidCode v = new ValidCode();
		v.checkstus(122);
		v = null;
		System.gc();
	}
}
class InvalidNoException extends Throwable
{
	InvalidNoException(String msg)
	{
		super(msg);
	}
}
class ValidCode
{
   	public void checkstus(int num)throws InvalidNoException
	{
		
		if( num == 123)
		{
			System.out.println("waiting");
		}
		else if( num == 456)
		{
			System.out.println("Confirmed");
		}
		else if( num == 789)
		{
			System.out.println("RAC");
		}
		else
		{
			InvalidNoException i = new InvalidNoException("Invalid PNR no");
			throw i; // used for custom exception

			//System.out.println("Invali no");
		}
	}
	
}
