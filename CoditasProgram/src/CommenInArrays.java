import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

//Write a program to find common elements between two arrays.

public class CommenInArrays {

	public static void main(String[] args) {
		System.out.println("enter elements for first array");
		int[] firstArray=getArray();
		System.out.println("enter elements for second array");
		int[] secondArray=getArray();		
		findCommonElements(firstArray,secondArray);
	}

	private static int[] getArray() {
		Scanner input=new Scanner(System.in);
		System.out.println("how many numbers you want to enter");
		int n=input.nextInt();
		int[] elements=new int[n];
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

	private static void findCommonElements(int[] firstArray, int[] secondArray) {
		Arrays.sort(secondArray); //necessary  for defined result
		int[] testArray;
		if(firstArray.length>secondArray.length) testArray=firstArray;
		else testArray=secondArray;
		System.out.println("Following are the common elements between two arrays:");
		for(int element:testArray)
		{
			int index=Arrays.binarySearch(secondArray, element);
			if(index>0) System.out.println(secondArray[index]);
		}
		
	}

}
