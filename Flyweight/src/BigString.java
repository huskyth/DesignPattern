
public class BigString {
	private Bigchar[] bus;
	public BigString(String string) {
		// TODO Auto-generated constructor stub
		initShared(string);
		
	}
	
	public BigString(String string,boolean shared) {
		// TODO Auto-generated constructor stub
		if(shared) {
			initShared(string);
		}else {
			initUnShared(string);
		}
	}
	
	public void print() {
		for (int i = 0; i < bus.length; i++) {
			bus[i].print();
		}
	}

	
	private void initShared(String string) {
		bus = new Bigchar[string.length()];
		BigcharFactory bigcharFactory = BigcharFactory.getInstance();
		for (int i = 0; i < bus.length; i++) {
			bus[i] = bigcharFactory.getBigchar(string.charAt(i));
		}
	}
	
	private void initUnShared(String string) {
		bus = new Bigchar[string.length()];
		BigcharFactory bigcharFactory = BigcharFactory.getInstance();
		for (int i = 0; i < bus.length; i++) {
			bus[i] = new Bigchar(string.charAt(i));
		}
	}
}
