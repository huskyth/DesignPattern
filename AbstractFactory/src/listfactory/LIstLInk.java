package listfactory;

import factory.Link;

public class LIstLInk extends Link{

	public LIstLInk(String caption, String url) {
		super(caption, url);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		return " <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
	}

}
