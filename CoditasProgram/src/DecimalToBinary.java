public class DecimalToBinary {
	public static void main(String[] args)
	{
		int no=23412,rem=0;
		String s="";
		while(no>0)
		{
			rem=no%2;
			s=s+rem+"";
			no=no/2;
		}
		System.out.println(new StringBuffer(s).reverse());
	}
}
