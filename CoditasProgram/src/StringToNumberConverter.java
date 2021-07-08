import java.util.Scanner;

//Write a program to convert string to number without using Integer.parseInt() method.

public class StringToNumberConverter {

	public static void main(String[] args) {
		String inputString=getNumber();
		converToNumber(inputString);
	}
	private static void converToNumber(String inputString) {
		int number=0,j=1;
		for(int i=inputString.length()-1;i>=0;i--)
		{
			if(Character.isDigit(inputString.charAt(i)))
			{
				number=number+Character.getNumericValue(inputString.charAt(i))*j;
				j*=10;
			}
			else System.out.println("Enter string strictly containing integer");
		}
		System.out.println(number);	
	}
	private static String getNumber() {
		Scanner input=new Scanner(System.in);
		System.out.println("enter number");		
		input.close();
		return input.nextLine();
	}

}
