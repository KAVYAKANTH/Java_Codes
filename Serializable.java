import java.io.*;
import java.util.*;
class Serializable
{
	public static void main(String[] args)throws FileNotFoundException ,IOException,ClassNotFoundException

	{
		Emp e = new Emp(10,"Bharadwaj","123456789");
		
		//Serializable
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("bantu.txt")));
		out.writeObject(e);
		System.out.println("Serialization byte code converted!!! - SUCESS");
		//coverts the current state object to byte code to pass it network
		
		ObjectInputStream in =new ObjectInputStream(new FileInputStream(new File("bantu.txt")));
		//de-seriable- coverts byte code to object refference
		Emp e2 =(Emp)in.readObject();
		System.out.println(e2);
		System.out.println("De-Serializable is realese to object state - Sucess!!");
	}
}


class Emp implements Serializable
{
	 int empId;
	 String empName;
	 String empSalary;
	
	Emp(int empId, String empName, String empSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}
	@Override
	public int hashCode() {
		return Objects.hash(empId, empName, empSalary);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return empId == other.empId && Objects.equals(empName, other.empName)
				&& Objects.equals(empSalary, other.empSalary);
	}
	
	@Override
	public String toString() {
		return "Test [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
	

	

