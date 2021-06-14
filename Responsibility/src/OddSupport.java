
public class OddSupport extends Support{
	private int limit;

	public OddSupport(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		if(trouble.getNumber() % 2 == 1) {
			return true;
		}else {
			return false;
		}
	}
}
