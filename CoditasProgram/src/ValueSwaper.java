
//How to swap two numbers without using temporary variable?

public class ValueSwaper {

	public static void main(String[] args) {
		int[] numbers=getNumbers();		
		swapNumbers(numbers[0],numbers[1]);
	}

	private static int[] getNumbers() {
		int[] numbers=new int[]{10,20};
		return numbers;
	}

	private static void swapNumbers(int firstNumber, int secondNumber) {
		System.out.println("Elements before swapping: firstNubber: "+firstNumber+" secondNumber "+secondNumber);
		firstNumber=firstNumber+secondNumber;
		secondNumber=firstNumber-secondNumber;
		firstNumber=firstNumber-secondNumber;
		System.out.println("Elements after swapping: firstNumber: "+firstNumber+" secondNumber "+secondNumber);
	}

}
