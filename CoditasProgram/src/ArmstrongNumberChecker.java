import java.util.Scanner;

public class ArmstrongNumberChecker {

	public static void main(String[] args) {
		int inputNumber=getNumber();
		if(checkArmstrong(inputNumber)) System.out.println(inputNumber+" number is armstrong number");
		else System.out.println(inputNumber+" number is not armstrong number");
	}

	private static boolean checkArmstrong(int inputNumber) {
		double sum=0.0;
		int tempararyNumber=inputNumber;
		int numberOfDigits=Integer.toString(inputNumber).length();
		while(inputNumber>0)
		{
			int remainder=inputNumber%10;
			sum=sum+Math.pow(remainder, numberOfDigits);
			inputNumber=inputNumber/10;
		}
		if(sum==(double)tempararyNumber)
			return true;
		return false;
	}

	private static int getNumber() {
		Scanner input=new Scanner(System.in);
		System.out.println("enter number");		
		return input.nextInt();
	}
}
