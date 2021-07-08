import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindTwoMax {

	public static void main(String[] args) {
		Integer[] firstArray= new Integer[]{91,72,33,43,52,21,0};
		Integer[] secondArray= new Integer[]{1,27,3,463,3333,96,42};
		Arrays.sort(secondArray);
		System.out.println("Largest elements from firstArray"+firstArray[firstArray.length-1]+" Second Large element from first array "+firstArray[firstArray.length-2]);
		System.out.println("Largest elements from firstArray"+secondArray[secondArray.length-1]+" Second Large element from first array "+firstArray[secondArray.length-2]);
	}
	public static void findMaxTwoElements(int[] firstArray,int[] secondArray)
	{
		
	}
}
