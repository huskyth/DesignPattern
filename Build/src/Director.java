
public class Director {
	private Builder builder;
	public Director(Builder builder) {
		// TODO Auto-generated constructor stub
		this.builder = builder;
	}
	
	public void construct() {
		builder.makeTitle("Greeting");
		builder.makeString("������ֽ����");
		builder.makeItems(new String[] {
			"���Ϻ�",
			"�����",
		});
		builder.makeString("����");
		builder.makeItems(new String[] {
			"���Ϻ�",
			"��",
			"�ټ�"
		});
		builder.close();
	}

}
