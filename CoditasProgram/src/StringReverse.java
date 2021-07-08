import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		    String str = getString();
	        String reversed = reverseString(str);
	        System.out.println("The reversed string is: " + reversed);
	    }
	
	private static String getString() {
		Scanner input=new Scanner(System.in);
		System.out.println("enter String");		
		return input.nextLine();
	}
	    public static String reverseString(String str)
	    {
	        if (str.isEmpty())
	            return str;
	       	return reverseString(str.substring(1)) + str.charAt(0);
	    }

}
