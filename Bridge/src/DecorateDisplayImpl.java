
public class DecorateDisplayImpl extends DisplayImpl{
	private String head;
	private String body;
	private String foot;
	public DecorateDisplayImpl( String head, String body, String foot) {
		this.head = head;
		this.body = body;
		this.foot = foot;
	}

	@Override
	public void rawOpen() {
		System.out.print(head);
		
	}

	@Override
	public void rawPrint() {
		
		System.out.print(body);
	}

	@Override
	public void rawClose() {
		// TODO Auto-generated method stub
		System.out.println(foot);
	}

}
