public class FindPerfect {
	public static void main(String[] args)
	{
		int no=8128,sum=0;
		for(int i=1;i<no;i++)
		{
			if(no%i==0)
				sum=sum+i;
		}
		if(sum==no) System.out.println("Number is perfect number");
		else System.out.println("Number is not perfect number");
	}
}
