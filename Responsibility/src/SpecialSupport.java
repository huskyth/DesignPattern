
public class SpecialSupport extends Support{
	private int number;

	public SpecialSupport(String name,int number) {
		super(name);
		// TODO Auto-generated constructor stub
		this.number =number;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		if(trouble.getNumber() == number) {
			return true;
		}else {
			return false;
		}
	}
}
