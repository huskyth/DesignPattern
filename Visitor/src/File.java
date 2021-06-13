public class File extends Entry{

	private String name;
	private int size;
	
	public File(String name,int size) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.size = size;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}
	
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
		v.visit(this);;
	}

	
}

	
	
