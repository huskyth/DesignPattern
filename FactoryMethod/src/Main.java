import framework.Factory;
import framework.Product;
import idcard.IDCard;
import idcard.IDCardFactory;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product p1 = factory.create("С��");
		Product p2 = factory.create("С��");
		Product p3 = factory.create("С·");
		p1.use();
		p2.use();
		p3.use();
		
		
		
	}

}
