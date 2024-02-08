import java.util.*;
class CustomSetASCDS
{
public static void main(String[] args)
	{
		
		TreeSet<Employee> t = new TreeSet<>(new CustomSet());
		t.add(new Employee(10,"Kavya",10000));
		t.add(new Employee(50,"Anjali",40000));
		t.add(new Employee(30,"Bantu",30000));
		t.add(new Employee(20,"Lakshmi",50000));
		System.out.println(t);
	
	}
}
class Employee
{
	int id;
	String name;
	int Salary;
	
	Employee(int id,String name,int Salary)
	{
			this.id=id;
			this.name=name;
			this.Salary=Salary;
		
		
	}
	public String toString()
	{
		return "EmployeeId is: " +id + " " +"Employee name:" +name + " " +" Employee Salary:" +Salary +" " +'\n';
	}
	
}

class CustomSet implements Comparator<Employee>
{

	public int compare(Employee e1, Employee e2)
	{
		return e1.id-e2.id;
	}
	
}	