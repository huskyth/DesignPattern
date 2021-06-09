package tablefactory;

import factory.Link;

public class TableLink extends Link{
	public TableLink(String caption, String url) {
		super(caption, url);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		return " <td><a href=\"" + url + "\">" + caption + "</a></td>\n";
	}
}
