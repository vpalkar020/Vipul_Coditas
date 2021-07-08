import java.util.Scanner;

//Write a program to find the sum of the first 1000 prime numbers.

public class PrimeAddition {

	public static void main(String[] args) {
	int numberOfPrime=getNumber();
	getPrimeNumberSum(numberOfPrime);

	}

	private static int getNumber() {
		Scanner input=new Scanner(System.in);
		System.out.println("how many number's sum you want");		
		return input.nextInt();
	}

	private static void getPrimeNumberSum(int numberOfPrime) {
		int sum=0,count=0,primeCount=0;
		for(int i=2;primeCount!=numberOfPrime;i++)
		{ count=0;
			for(int j=1;j<i;j++)
			{
				if(i%j==0) count++; 
			}
			if(count<=1) { sum=sum+i;primeCount++;}
		}
		System.out.println(sum);//1+2+3+5+7+11+13
	}

}
