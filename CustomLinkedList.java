class CustomLinkedList
{
	public static void main(String[] args)
	{

		CustomLinked c = new CustomLinked(); //CREATING a object
		c.add(10); // add the values
		c.add(20);
		c.add(30);
		c.add(40);
		c.Show();
	}
	

}
class CustomLinked
{
	Node head; // creating variable linkedlist firstnode = head;

	public void add(int data)//adding data as paramter
	{
		Node node = new Node(data);//creating an object of node taking data in parameter
		if(head==null)//intially firstnode =null
		{
			head =node ;//assiging values to first node as 10
		}
		else
		{
			Node n1 = head; //creating an variable pointing to refernce object
			while(n1.next!=null)//if reffernce  next object is not null
			{
				
				n1=n1.next;//checks which reffernce object is null assign the next values.
			}
			n1.next=node;
			
		}
	}	
	public void Show() 
	{
		Node n1 = head;
		while(n1.next!=null)//display refernce object is not null
		{
			System.out.println(n1.data);//printing refernce object
			n1=n1.next;//it will iterate and check which object are not null
		}
		System.out.println(n1.data);//printing refernce object
		
	}
}
class Node
{
	int data; // creating variable data
	Node next; // creating variable next
	Node(int data)
	{
		this.data=data;//creating a current object to point
		next=null; // point next as a null
	}
}
