
public class CountDisplay extends Display{
	
	public CountDisplay(DisplayImpl imp) {
		super(imp);
	}
	
	public void multiDisplay(int times) {
		open();
		for (int i = 0; i < times; i++) {
			print();
		}
		close();
	}
}
