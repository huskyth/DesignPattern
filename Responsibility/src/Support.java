public abstract class Support {
	private String name;
	private Support next;
	public Support(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	public Support setNext(Support support) {
		this.next = support;
		return support;
	}
	
	public final void support(Trouble trouble) {
//		if(resolve(trouble)) {
//			done(trouble);
//		}else if(next != null) {
//			next.support(trouble);
//		}else {
//			fail(trouble);
//		}
		for (Support obj = this; true; obj = obj.next) {
			if(obj.resolve(trouble)) {
				obj.done(trouble);
				break;
			}else if(obj.next == null) {
				obj.fail(trouble);
				break;
			}
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + name + "]";
	}
	protected abstract boolean resolve(Trouble trouble);
	protected void done(Trouble trouble) {
		System.out.println(trouble + " is resolved by " + this + "." );
	}
	
	protected void fail(Trouble trouble) {
		System.out.println(trouble + "cannot be resolved" );
	}

}
