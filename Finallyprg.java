import java.io.*;
class Finallyprg
{
	public static void main(String[] args)
	{
		try
		{	

		File f = new File("C:\\learnings\\Java\\test.txtt");
		FileReader fr = new FileReader(f);	
		BufferedReader br = new BufferedReader(fr);
		System.out.println(br.readLine());
		}
		catch(IOException e)
		{
			System.out.print("Hello catch block \n");
		}
		finally
		{
			System.out.print("Performing cleaning activity");
			
			//fr.close();
			//br.close();
		}
		

	}
	
}