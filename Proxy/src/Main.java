
public class Main {
	
	public static void main(String[] args) {
		Printable printable = new PrinterProxy("Alice","Printer");
		System.out.println("���ڵ�������" + printable.getPrinterName());
		printable.setPrinterName("Bob");
		System.out.println("���ڵ�������"+ printable.getPrinterName());
		printable.print("Hello world");
	}
}
