//Java8 using Lambda

class JavaEightFunctionalInterface
{
	public static void main(String[] args)
				{
					I i = (x,y) ->(x+y);
					System.out.println(i.m1(10,20)); 
					System.out.println(i.m1(20,40)); 
					System.out.println(i.m1(30,60)); 
					System.out.println(i.m1(40,80)); 
					System.out.println(i.m1(50,200)); 
				}
}
			@FunctionalInterface
			interface I
			{
				public abstract int m1(int x, int y);
			}









/* reducing the code in java8 feature, thereshoud be No,Access modifer, No return type,no method name,
		No new keyword only Lamda symbol is allowed.
	class A implements I
	{
		public int m1(int x, int y) {
			return 0;
		}
}*/
	
