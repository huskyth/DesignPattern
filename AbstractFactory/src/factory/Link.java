package factory;

public abstract class Link extends Item{
	protected String url;
	public Link(String caption,String url) {
		super(caption);
		// TODO Auto-generated constructor stub
		this.url = url;
	}
}
