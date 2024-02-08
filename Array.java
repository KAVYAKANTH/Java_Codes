class Array
{
	
	public static void main(String[] args)
	{
		int[] x = new int[5];
		x[0] = 10;
		x[1] = 20;
		x[2] = 30;
		x[3] = 40;
		x[4] = 50;

		for(int i=0; i<x.length; i++)
		System.out.println(x[i]);
		System.out.println(x.getClass().getName());
		
		
		float[] f =new float[3];
		f[0] = 10.20f;
		f[1] = 20.10f;
		f[2] = 30.20f;
		for(int i=0;i<f.length;i++)
		{
			System.out.println(f[i]);
			System.out.println("Element at Index : "+ i + " " + f[i]);
			System.out.println(x.getClass().getName());
		}
		



	}
}




