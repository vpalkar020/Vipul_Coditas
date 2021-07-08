
class Printer {
	private static Printer myPrinter=null;
	public String printerName;
	private Printer()
	{
		
	}
	public static Printer getInstance()
	{
		synchronized(Printer.class)
		{
		if(myPrinter==null)
		{
			myPrinter=new Printer();
		}
		}
		return myPrinter;
	}
}
