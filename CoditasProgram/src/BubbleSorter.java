import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

//Write a program for Bubble Sort in java.

public class BubbleSorter {

	public static void main(String[] args)  {
		List<Integer> inputList=getList();
		if(inputList.isEmpty()) System.out.println("list is empty run again");
		else
		{
			sortList(inputList);
			printList(inputList);
		}      
	}
	private static void sortList(List<Integer> inputList) {
		for (int i = 0; i < inputList.size()-1; i++)
        {
            for (int j = 0; j < inputList.size()-i-1; j++)
            {
                if (inputList.get(j) > inputList.get(j+1))
                {
                    Integer temp = inputList.get(j);
                    inputList.set(j, inputList.get(j+1));
                    inputList.set(j+1,temp);
                }
            }
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
