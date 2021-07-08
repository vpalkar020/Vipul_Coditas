import java.util.InputMismatchException;
import java.util.Scanner;

//How to get distinct elements from an array by avoiding duplicate elements?

public class DistinctElementRetriever {
	public static void main(String[] args)
	{
		int[] firstArray=new int[]{12,34,54,25,1};//getArray();
		int[] secondArray=new int[]{12,34,3,5,7};//getArray();
		findDistinct(firstArray,secondArray);
	}
	private static void findDistinct(int[] firstArray, int[] secondArray) {
		
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

}
