class TwoDArray
{
	
	public static void main(String[] args)
	{
		OneDAray o = new OneDAray();
		o.OneD();
		TwoDArray t = new TwoDArray();
		t.TwoD();
		ThreeDArray th = ThreeDArray();
		th.ThreeD();
	}
			
			
}
class OneDAray
{
	public void OneD()
	{
	int[] x = new int[3];
	x[0] = 10;
	x[1] = 20;
	x[2] = 30;
	
	for(int i =0; i<x.length; i++)
		System.out.println(x[i]);
	}
	
}
class TwoDArray
{
	public void TwoD()
	{
		//int[][] y = new int[][5]; this way can also use;
		int[][] y = {{110,220,330},{440,550,660}};
		for (int[] p : y)
			for(int q : p)
			{
				System.out.println(q);
			}
	}
	
}
class ThreeDArray
{
		public void ThreeD()
		{
			int[][][] y = {{{1100,2200,3300}},{{4400,5500,6600}},{{2200,3300}}};
			for (int[][] p : y)
			{
				for(int[] q : p)
				{
					for(int w :q)
					{
						System.out.println(q);
					}
				}
				
			}
								
		}
}


