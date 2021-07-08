import java.util.Scanner;

//Write a program to check the given number is binary number or not?

public class BinaryChecker {

	public static void main(String[] args) {
		String inputNumber=getNumber();
		if(isBinary(inputNumber)) System.out.println(inputNumber+" is binary number");
		else System.out.println(inputNumber+" is not binary number");

	}
	private static boolean isBinary(String inputNumber) {
		if (inputNumber.isBlank() || inputNumber.isEmpty()) {
	            return false;
	        }
		for(int i=0;i<inputNumber.length();i++)
		{
			if(inputNumber.charAt(i)!='0' && inputNumber.charAt(i)!='1')
				return false;
		}
		return true;
	}
	private static String getNumber() {
		Scanner input=new Scanner(System.in);
		System.out.println("enter number");		
		return input.nextLine();
	}
}
