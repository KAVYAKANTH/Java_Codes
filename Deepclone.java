class Deepclone   // create a new object reffernce and it will not copy as original
{
	public static void main(String[] args)
	{
		shallow s = new shallow();
		s.setEmpid(20);
		s.setEmpname("Anjali");
		System.out.println("EmpID1 = "+s.empid+ "EmpName1 = "+s.empname);
		shallow s1 = new shallow();
		s1.setEmpid(s1.getEmpid());
		s1.setEmpname(s1.getEmpname());
		System.out.println("EmpID2 = "+s1.empid+ "EmpName2 = "+s1.empname);
	}
		
		
}
class shallow
{
	int empid;
	String empname;
  	public void setEmpid(int empid)
	{
		this.empid=empid;
		
	}
	public void setEmpname(String empname)
	{
		this.empname=empname;
		
	}
	public int getEmpid()
	{
		return empid;
		
	}
	public String getEmpname()
	{
		return empname;
		
	}
	public String toString()
	{
		return "Empid =" +empid+ "Empname = "+empname;
	}
}