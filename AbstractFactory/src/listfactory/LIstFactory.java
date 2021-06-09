package listfactory;

import factory.*;

public class LIstFactory extends Factory{

	@Override
	public Link createLink(String caption, String link) {
		// TODO Auto-generated method stub
		return new LIstLInk(caption,link);
	}

	@Override
	public Tray createTray(String caption) {
		// TODO Auto-generated method stub
		return new LIstTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		// TODO Auto-generated method stub
		return new ListPage(title,author);
	}

}
