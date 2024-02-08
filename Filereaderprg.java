import java.io.*;

class Filereaderprg
{
	public static void main(String[] args)
	{
		File t = new File();
		t.m1();
		
	}
}
class File
{
	public void m1()
	{	
		File = f;
		FileReader = fr;
		BufferedReader = br;
		try
		{
			
			new File("C:\\learnings\\Java\\Interface.txt");
			new FileReader(f);
			 new BufferedReader(fr);
			System.out.println(br.readLine());
		}
		catch(FileNotFoundException e)
		{
			System.out.println("FileNotFound");
		}
		catch(IOException e)
		{
			System.out.println("inputoutput exception");
		}
		finally
		{
			fr.close();
			br.close();
		}
	}
}