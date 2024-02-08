import java.io.*;
class Filereader
{	
	public static void main(String[] args)
	{
		
		Test t = new Test();
		t.m1();
	}
}
class Test
{
	public void m1()
	{
		try
		{
	
			File f = new File("C:\\learnings\\Java\\test.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			System.out.println(br.readLine());
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found expection");
		}
		catch(IOException e)
		{
			System.out.println("Hello I'm kavyanjali N here");
		}
		
	}
}
