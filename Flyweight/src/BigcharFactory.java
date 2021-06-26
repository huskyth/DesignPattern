import java.util.HashMap;

public class BigcharFactory {
	private HashMap<String, Bigchar> pool = new HashMap<>();
	private static BigcharFactory singleton = new BigcharFactory();
	private BigcharFactory() {
		
	}
	public static BigcharFactory getInstance() {
		return singleton;
	}
	public synchronized Bigchar getBigchar(char charname) {
		Bigchar bigchar = (Bigchar)pool.get(charname);
		if(bigchar == null) {
			bigchar = new Bigchar(charname);
			pool.put(""+charname,bigchar);
		}
		return bigchar;
	}

}
