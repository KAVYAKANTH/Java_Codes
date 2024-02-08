class StringandBuffer
{
	public static void main(String[] args)
	{
	
		String s1 = new String("Anjali"); // it will create new object & stores on heap memory
		String s2 = "Kavyanjali"; // it will not create any object stores as SCP(static constant pool) used for refference
		String s3 = s1.concat("N");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s1.hashCode()+"___________"+ s2.hashCode() +"_____");
		
	
		StringBuffer s4 = new StringBuffer("Boss");
		StringBuffer s6 = s4.append("kanth");
		System.out.println(s4);
		System.out.println(s6);
		System.out.println(s4==s6);
		System.out.println(s4.equals(s6));
		System.out.println(s4.hashCode()+"___________"+ s6.hashCode() +"____");
	}
	
}


/*


output
C:\learnings\Java>java StringandBuffer.java
Anjali
Kavyanjali
AnjaliN
Bosskanth
Bosskanth


heap
s1=Anjali
s3= s1(Anjali+N)
s4=Boss


scp
Anjali
s2=Kavyanjali
s3= s1(Anjali+N)
Boss=kanth=s6(append) == Bosskanth










*/