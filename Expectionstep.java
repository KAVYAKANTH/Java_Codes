import java.io.*;
class Expcetionstep
{
	public static void main(String[] args) throws IOException
	{
		Test t = new Test();
		t.m1();
		//t.printStackTrace();
	}
}
class Test
{
	public void m1() throws IOException
	{
		m2();
	}
	public void m2() throws IOException
	{
		m3();
	}
	public void m3() throws IOException
	{
		m4();
	}
	public void m4() throws IOException
	{
		BufferedReader br = new BufferedReader( new FileReader(new File("C:\\learnings\\Java\\test.txt")));
		System.out.println(br.readLine());
	}
}