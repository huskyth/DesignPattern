
public class Display {
	private DisplayImpl imp;
	public Display(DisplayImpl imp) {
		this.imp = imp;
	}
	
	public void open() {
		imp.rawOpen();
	}
	
	public void print() {
		imp.rawPrint();
	}
	
	public void close() {
		imp.rawClose();
	}
	
	public final void display() {
		open();
		print();
		close();
	}

}
