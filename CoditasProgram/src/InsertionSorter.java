import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InsertionSorter {

	public static void main(String[] args) {
		List<Integer> inputList=new ArrayList<>();
		inputList.add(12);
		inputList.add(1);
		inputList.add(42);
		inputList.add(502);
		inputList.add(2);
				//getList();
		if(inputList.isEmpty()) System.out.println("list is empty run again");
		else
		{
			sortList(inputList);
			printList(inputList);
		}      
	}
	private static void sortList(List<Integer> inputList) {
	
	        for (int i = 1; i < inputList.size();++i) {
	            int key = inputList.get(i);
	            int j = i - 1;
	            while (j >= 0 && inputList.get(j) > key) {
	            	inputList.set(j+1,inputList.get(j));
	                j = j - 1;
	            }
	            inputList.set(j+1,key);
	        }
        }
	private static List<Integer> getList()
	{
		List<Integer> inputList=new ArrayList<>();
		System.out.println("enter elements:");
		Scanner input=new Scanner(System.in);
		try {
			int i=0;
			while((i=input.nextInt())!=-1)
			{
				inputList.add(i);
			}
		}
		catch (InputMismatchException e) {
			System.out.println("Enter only integer");
			inputList.clear();
		}
		return inputList;
	}
	private static void printList(List<Integer> list)
	{
		for(Integer temp:list)
		{
			System.out.println(" "+temp);
		}
	}

}
