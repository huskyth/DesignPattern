
public class Main {
	public static void main(String[] args) {
//		Display d1 = new Display(new StringDisplayImpl("Hello China"));
//		Display d2 = new CountDisplay(new StringDisplayImpl("Hello World"));
//		CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello Universe"));
//		d1.display();
//		d2.display();
//		d3.display();
//		d3.multiDisplay(5);
		
//		Display randomCountDisplay = new RandomCountDisplay(new StringDisplayImpl("Hello Canada"));
//		((RandomCountDisplay) randomCountDisplay).randomDisplay(10);
		
//		CountDisplay countDisplay = new CountDisplay(new FileDisplayImpl("E:\\Eclipse\\workspace\\Bridge\\src\\star.txt"));
//		countDisplay.multiDisplay(3);
		
		DecorateDisplay d1 = new DecorateDisplay(new DecorateDisplayImpl("<", "*", ">"), 1);
		DecorateDisplay d2 = new DecorateDisplay(new DecorateDisplayImpl("|", "*", "-"), 2);
		d1.increaseDisplay(4);
		d2.increaseDisplay(6);
	}

}
