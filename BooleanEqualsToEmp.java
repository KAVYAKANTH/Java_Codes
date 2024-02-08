class BooleanEqualsTo
{
	public static void main(String[] args)
	{
		Emp s1 = new Emp(10, "Anjali");
		Emp s2 = new Emp(20, "anjali");
		
		System.out.println(s1==s2); // refernce comparision
		System.out.println(s1.equals(s2)); // need to overide content comparision
		
		
	} 
}
class Emp
{
	public final int empId;
	public final String empName;
	
	Emp(int empId,String empName)
	{
		this.empId = empId;
		this.empName = empName;
	}
}