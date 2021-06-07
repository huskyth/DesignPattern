package noname;

import framework.Product;

public class UnderLInePen implements Product{
	private char ulchar;
	public UnderLInePen(char ulchar) {
		// TODO Auto-generated constructor stub
		this.ulchar = ulchar;
	}
	@Override
	public void use(String s) {
		// TODO Auto-generated method stub
		int len = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		System.out.print(" ");
		for (int i = 0; i < len; i++) {
			System.out.print(ulchar);
		}
		System.out.println(" ");
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
