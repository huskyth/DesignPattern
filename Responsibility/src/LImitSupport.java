
public class LImitSupport extends Support{
	private int limit;

	public LImitSupport(String name,int limit) {
		super(name);
		// TODO Auto-generated constructor stub
		this.limit = limit;
	}

	@Override
	protected boolean resolve(Trouble trouble) {
		// TODO Auto-generated method stub
		if(trouble.getNumber() < limit) {
			return true;
		}else {
			return false;
		}

	}

}
