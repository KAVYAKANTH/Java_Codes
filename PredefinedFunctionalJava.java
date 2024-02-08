import java.util.function.*;
class PredefinedFunctionalJava
{
	public static void main(String[] args)
	{
		//Predict the given values is true or not
		Predicate<Integer> p = x->(x-8==0);
		System.out.println(p.test(4));

		//Consumer : It will takes the Input parameter
		Consumer<Integer> q = y->System.out.println(y*10);
		q.accept(4);
		
		//Supplier: It will retuen the ouput parameter
		Supplier<Integer> r = ()->1000+200;
		System.out.println(r.get());

		//Function: It will takes the Input Parameter and return the output parameter
		Function<Integer,Integer> s = a -> a/200;
		System.out.println(s.apply(500));
			


	}
}