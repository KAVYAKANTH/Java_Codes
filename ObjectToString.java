import java.lang.reflect.*;
import java.io.*;
class ObjectToString
{
	public static void main(String[] args)
	{
		int count=1;
		Object o = new Object();
		Class c = o.getClass();
		System.out.println(o.hashCode());
		System.out.println(c.getName());
		System.out.println(c.getSuperclass());
		Method[] method = c.getDeclaredMethods();
		for(Method a:method)
		{
			System.out.println((++count)+"------->" +a);
		}
		Method[] methods = c.getDeclaredMethods();
		for(Method a1:methods)
		{
			System.out.println(a1.getName()+"===="+(count++));
		}
		
		Emp e1 = new Emp(10,"Anjali");
		System.out.println(e1.toString());
	}
}
class Emp
{
	int empId;
	String empName;
	Emp(int empId, String empName)
	{
		this.empId = empId;
		this.empName = empName;
	}
	public String toString()
	{
		return "Employee ID: " + empId + ", Employe Name: " + empName;
	}
}

