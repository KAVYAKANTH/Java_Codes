//try with resource and multi catch 
// close automatically if use trywith multi resource
import java.io.*;
class Trywithresource 
{
	public static void main(String[] args)
	{
		try(BufferedReader br = new BufferedReader(new FileReader(new File("C:\\learnings\\Java\\test.txt"))))
		{
			System.out.println(br.readLine());
			System.out.println("Trying with resource");
			System.out.println(100/0);
			
		}
		catch(IOException | ArithmeticException | NullPointerException e )
		{
			System.out.println("Executing multi catch");
			
		}
	}
}
