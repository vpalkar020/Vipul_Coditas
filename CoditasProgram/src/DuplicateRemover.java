import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class DuplicateRemover {

	public static void main(String[] args) {
		Integer[] inputArray=getArray();
		inputArray=removeDuplicates(inputArray);
		printArray(inputArray);

	}
	private static void printArray(Integer[] inputArray) {
		for(int i=0;i<inputArray.length;i++)
		{
			System.out.print(" "+inputArray[i]);
		}
	}
	private static Integer[] removeDuplicates(Integer[] inputArray) {
		Arrays.sort(inputArray);
		List<Integer> inputList=new ArrayList<Integer>();
		for(int i=0;i<inputArray.length;i++) //Adding array elements to ArrayList
		{
			inputList.add(inputArray[i]);
		}
		for(int i=0;i<inputList.size()-1;i++)//array is a fixed sized datastructure
			{								 //so can't remove elements from array
			if(inputList.get(i).equals(inputList.get(i+1)))
			{
				inputList.remove(i+1);
				i--;
			}
		}
		inputArray=new Integer[inputList.size()];
		for(int i=0;i<inputList.size();i++)
		{
			inputArray[i]=inputList.get(i);
		}
		return inputArray;
	}
	private static Integer[] getArray() {
		Scanner input=new Scanner(System.in);
		System.out.println("how many numbers you want to enter");
		int n=input.nextInt();
		Integer[] elements=new Integer[n];
		System.out.println("enter "+n+" elements");
		try {
		for(int i=0;i<n;i++)
		{
			elements[i]=input.nextInt();
		}
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter integer elements ");
		}
		return elements;
	}

}
