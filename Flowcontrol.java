/* Flow control 
If else - multiple cond, boolean condition,greater or lesser.
== (used to check the condition), = will not used to check condition,
Switch - multiple conditiuin
for loop - used for mutilple iteration
while do - it wont suppoet decalared as final shows unreachable.
*/


class Flowcontrol
{
	public static void main(String[] args)	
	{
	
		State b= new State();
		b.m1(100);
		b.m2(50,150);
		b.m3();
		b.m4();


	}
}
class State
{
	public void m1(int x)
	{
		
		if(x==10)
		{
			System.out.println(" printing the values: "  + x);
		}
		else if (x==20)
		{
			System.out.println(" printing the values: "  +x);
		}
		else if(x==30)
		{
			System.out.println("  printing the values: "  +x);
		}
		else
		{
			System.out.println("In Else block printing the values" );
		}
	}
	public void m2(int p, int q)
	{
		if(p>q)
				{
			if(p>=q)
				{
					System.out.println("In Greater number");
				}
				}
		else if(p<q)
		{
				System.out.println("In lesser number");
		}
		else
		{
				System.out.println("In else part");
		}

	
	}
	public void m3()
	{
			
		int i=1;
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
			
	}
	public void m4()
	{
		int number=50;
		switch(number)
		{
			case 10: 
				System.out.println("enter no 10");
				break;
			case 20: 
				System.out.println(" enter no 20");
				break;
			case 30: 
				System.out.println("enter no30");
				break;
			case 40: 
				System.out.println("enter no 40");
				break;
			case 50: 
				System.out.println("enter no 50");
				break;
			default: 
				System.out.println(" enter no not in 10-50");
		}
	}
}