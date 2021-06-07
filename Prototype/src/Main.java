import framework.Manager;
import framework.Product;
import noname.MessageBox;
import noname.UnderLInePen;

public class Main {

	public static void main(String[] args) {
		Manager manager = new Manager();
		UnderLInePen underLInePen = new UnderLInePen('~');
		MessageBox mBox = new MessageBox('*');
		MessageBox sBox = new MessageBox('/');
		manager.register("strong", underLInePen);
		manager.register("warning", mBox);
		manager.register("slash", sBox);
		
		Product p1 = manager.create("strong");
		p1.use("hello world");
		Product p2 = manager.create("warning");
		p2.use("hello world");
		Product p3 = manager.create("slash");
		p3.use("hello world");
		
	}
}
