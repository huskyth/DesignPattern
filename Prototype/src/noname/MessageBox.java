package noname;

import framework.Product;

public class MessageBox implements Product{
	private char decochar;
	public MessageBox(char decochar) {
		// TODO Auto-generated constructor stub
		this.decochar = decochar;
	}

	@Override
	public void use(String s) {
		// TODO Auto-generated method stub
		int leng = s.getBytes().length;
		for (int i = 0; i < leng + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
		System.out.println(decochar + " " + s +" " +decochar);
		for (int i = 0; i < leng + 4; i++) {
			System.out.print(decochar);
		}
		System.out.println("");
	}

	@Override
	public Product createClone() {
		// TODO Auto-generated method stub
		Product product = null;
		try {
			product = (Product)clone();
		} catch (CloneNotSupportedException e) {
			// TODO: handle exception
			e.printStackTrace();

		}
		return product;
	}
	
}
