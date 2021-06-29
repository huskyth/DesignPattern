
public class PrinterProxy implements Printable{
	private String name;
	private Printable real;
	private String classname;
	
	public PrinterProxy() {
		// TODO Auto-generated constructor stub
	}
	
	public PrinterProxy(String name,String className) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.classname = className;
	}

	@Override
	public synchronized void setPrinterName(String name) {
		// TODO Auto-generated method stub
		if(real != null) {
			real.setPrinterName(name);
		}
		this.name = name;
	}

	@Override
	public String getPrinterName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void print(String string) {
		// TODO Auto-generated method stub
		realize();
		real.print(string);
		
	}
	
	private synchronized void realize() {
		if(real == null) {
			real = new Printer();
			
			try {
				real = (Printable)Class.forName(classname).newInstance();
			}  catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.err.println("没有找到"+classname + "类。");
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			real.setPrinterName(name);
			
		}
	}

}
