import java.util.ArrayList;
import java.util.List;

public class LinkedList {
	Node head;
	
	public void insert(int data)
	{
		Node newnode=new Node(data);
		if(head==null)
		{
			head=newnode;
		}
		else
		{
			newnode.next=head;
			head=newnode;
		}
		
	}
	public void printList()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	public void reverseList()
	{
		Node temp=head;
		List<Integer> elements=new ArrayList<>();
		while(temp!=null)
		{
			elements.add(temp.data);
			temp=temp.next;
		}
		temp=head;
		int i=0;
		while(temp!=null)
		{
			temp.data=elements.get((elements.size()-i)-1);
			temp=temp.next;
			i++;
		}
	}
}
