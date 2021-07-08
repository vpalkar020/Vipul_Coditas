public class ReverseNumber {

	public static void main(String[] args) {
		long number=00012345;
		int rev=0;
		while(number>0)
		{
			int rem=(int)number%10;
			rev=rev*10+rem;
			number=number/10;
		}
		System.out.println(rev);
	}

}
