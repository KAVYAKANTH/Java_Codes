/* string does not support reverse string manually because it will new object for each string object and consume more menory and shows outof memory pool.

we can call reverse string using reverse()

Insted of that we can use StringBuffer it will append and use for reverse string

*/

class ReverseStringBuffer
{

	public static void main(String[] args)
	{
		String s = "Anjali";
		StringBuffer bro = new StringBuffer();
		String[] s1 = s.split("");
		for(int i=s1.length-1;i>-1;i--)
		{
			bro.append(s1[i]).append("");
		}
		System.out.println(bro);
	}
}
