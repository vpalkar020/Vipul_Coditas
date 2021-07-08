
public class SingletonClassImplementor {

	public static void main(String[] args) {
		Printer collegePrinter=Printer.getInstance();
		Printer departmentPrinter=Printer.getInstance();
		Printer teachersPrinter=Printer.getInstance();
		System.out.println(collegePrinter.printerName);//points to single reference
		System.out.println(departmentPrinter.printerName);//points to single reference
		System.out.println(teachersPrinter.printerName);//points to single reference
	}

}
