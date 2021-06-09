package listfactory;

import java.util.Iterator;

import javax.security.sasl.AuthorizeCallback;

import factory.Item;
import factory.Page;

public class ListPage extends Page{

	public ListPage(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("<html><head><title>" + title + "</title></head>\n");
		stringBuffer.append("<body>\n");
		stringBuffer.append("<h1>" + title +"</h1>\n");
		stringBuffer.append("<ul>\n");
		Iterator iterator = content.iterator();
		while (iterator.hasNext()) {
			Item  item = (Item) iterator.next();
			stringBuffer.append(item.makeHTML());
		}
		stringBuffer.append("<ul>\n");
		stringBuffer.append("<hr><address>" + author + "</address>");
		stringBuffer.append("</body></html>\n");
		return stringBuffer.toString();
	}
}
