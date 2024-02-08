import java.io.*;
class Trymanualclose
{
	public static void main(String[] args)
	{

		FileReader fr = null;
		BufferedReader br = null;
		try
		{

			File f = new File("C:\\learnings\\Java\\test.txt");
			 fr = new FileReader(f);
			 br = new BufferedReader(fr);
			System.out.println(br.readLine());
		
		}
		catch(IOException | ArithmeticException | NullPointerException e )
		{
			System.out.println("Executing catch block and closing manually");
			
		}
	
		finally
		{
			try		
			{
	
				if(br != null && fr !=null)
				{
					fr.close();
					br.close();
				}
			}
			catch(IOException e)
			{
				System.out.println("Clsing the blocks maunally");
				e.printStackTrace();
			}
			System.out.println("Finally block will exceute");
		}
	}
}