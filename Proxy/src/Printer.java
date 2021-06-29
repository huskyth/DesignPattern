


public class Printer implements Printable{
	private String name;
	public Printer() {
		// TODO Auto-generated constructor stub
		heavyJob("正在生成Printer实例");
	}
	
	public Printer(String name){
		this.name   = name;
		heavyJob("正在生成Printer实例(" + name +")");
	}


	@Override
	public void print(String string) {
		// TODO Auto-generated method stub
		System.out.println("===" + name +"===");
		
		System.out.println(string);
	}

	
	public void setPrinterName(String name) {
		this.name   = name;
	}
	
	public String getPrinterName() {
		return name;
	}
	
	private void heavyJob(String msg) {
		System.out.print(msg);
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.print(".");
		}
		System.out.print("结束。");
	}
	
	
}
