import java.util.Scanner;

public class PrimeNumberChecker {

	public static void main(String[] args) {
		int inputNumber=getNumber();
		if(checkPrime(inputNumber)) System.out.println("Given number is prime number");
		else System.out.println("Given number is not prime number");
	}

	private static boolean checkPrime(int inputNumber) {
		int i=0;
		for(i=2;i<inputNumber;i++)
		{
			if(inputNumber%i==0) break;
		}
		if(i==inputNumber) return true;
		return false;
	}

	private static int getNumber() {
		Scanner input=new Scanner(System.in);
		System.out.println("enter number");		
		return input.nextInt();
	}

}
