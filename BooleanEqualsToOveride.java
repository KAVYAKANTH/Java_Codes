class BooleanEqualsToOveride
{
	public static void main(String[] args)
	{
		Emp s1 = new Emp(10, "Anjali");
		Emp s2 = s1;
		Emp s3 = new Emp(20, "Kavya");
		
		System.out.println(s1==s2); // refernce comparision
		System.out.println(s1.equals(s2)); // need to overide content comparision
		System.out.println(s2==s3); // refernce comparision
		System.out.println(s2.equals(s3)); // need to overide content comparision
		System.out.println(s1==s3); // refernce comparision
		System.out.println(s1.equals(s3)); // need to overide content comparision
		
		
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
public boolean equals(Object o)// overiding equals object
{
	if(o==null)
	return false;
	Emp s2=(Emp)o; //typecasting emp 
	return empId==s2.empId && EmpName.equals(s2.Empname);
}