public class ReverseLinkedList {

	public static void main(String[] args) 
	{
	LinkedList list=new LinkedList();
	list.insert(10);
	list.insert(20);
	list.insert(30);
	list.insert(40);
	list.insert(50);
	System.out.println("Before reversing list");
	list.printList();
	System.out.println("After reversing list");
	list.reverseList();
	list.printList();
	}

}
