class Shallowclone   // copy the reference of an object
{
	public static void main(String[] args)
	{
		shallow s = new shallow();
		s.setEmpid(20);
		s.setEmpname("Anjali");
		System.out.println("EmpID1 = "+s.empid+"EmpName1 = "+s.empName);
		shallow s1 = s;
		System.out.println("EmpID2 = "+s.empid+"EmpName2 = "+s.empName);
	}
		
		
}
class shallow
{
	int empid;
	String empName;
  	public void setEmpid(int empid)
	{
		this.empid=empid;
		
	}
	public void setEmpname(String empName)
	{
		this.empid=empid;
		
	}
	public int getEmpid()
	{
		return empid;
		
	}
	public String getEmpname()
	{
		return empName;
		
	}
	public String toString()
	{
		return "Empid =" +empid+ "Empname = "+empName;
	}
}