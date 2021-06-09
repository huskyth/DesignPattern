package listfactory;

import java.util.Iterator;

import factory.Item;
import factory.Tray;

public class LIstTray extends Tray{

	public LIstTray(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("<li>\n");
		sBuffer.append(caption + "\n");
		sBuffer.append("</ul>\n");
		Iterator iterator = trArrayList.iterator();
		while (iterator.hasNext()) {
			Item item = (Item)iterator.next();
			sBuffer.append(item.makeHTML());
		}
		sBuffer.append("</ul>\n");
		sBuffer.append("</li>\n");
		return sBuffer.toString();
	}
	


}
