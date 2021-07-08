
public class FibonacciPrinter {

	public static void main(String[] args) {
		printFibonacci();

	}

	private static void printFibonacci() {
		 int firstNumber=0,secondNumber=1,nextNumber,i,count=10;    
		 System.out.print(firstNumber+" "+secondNumber);//printing 0 and 1    
		    
		 for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
		 {    
			 nextNumber=firstNumber+secondNumber;    
		  System.out.print(" "+nextNumber);    
		  firstNumber=secondNumber;    
		  secondNumber=nextNumber;    
		 }    
		
	}

}
