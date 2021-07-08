import java.util.Scanner;

//Write a program to convert binary to decimal number.

public class BinaryToDecimalConverter {

	public static void main(String[] args) {
		String inputNumber=getNumber();
		int decimalNumber=converDecimalToBinary(inputNumber);
		System.out.println("Decimal representation of "+inputNumber+" is "+decimalNumber);

	}
	private static Integer converDecimalToBinary(String binaryNumber) {
		
		int sum=0;
		for(int i=binaryNumber.length()-1;i>=0;i--)
		{
			if(binaryNumber.charAt(i)=='0') continue;
			if(binaryNumber.charAt(i)=='1')
				sum=sum+(int)Math.pow(2,(binaryNumber.length()-1)-i);
		}
		return sum;
	}
	private static String getNumber() {
		Scanner input=new Scanner(System.in);
		System.out.println("enter number");		
		return input.nextLine();
	}
}
