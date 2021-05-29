import framework.Factory;
import framework.Product;
import idcard.IDCard;
import idcard.IDCardFactory;

public class Main {
	public static void main(String[] args) {
		Factory factory = new IDCardFactory();
		Product p1 = factory.create("小明");
		Product p2 = factory.create("小工");
		Product p3 = factory.create("小路");
		p1.use();
		p2.use();
		p3.use();
		
		
		
	}

}
