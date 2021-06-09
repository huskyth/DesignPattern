package tablefactory;

import java.util.Iterator;

import factory.Item;
import factory.Tray;

public class TableTray extends Tray{
	public TableTray(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String makeHTML() {
		// TODO Auto-generated method stub
		StringBuffer sBuffer = new StringBuffer();
		sBuffer.append("<td>\n");
		
		sBuffer.append("<table width=\"100%\" border=\"1\"><tr>");
		sBuffer.append("<td bgcolor=\"#cccccc\" align=\"center\" colspan\"" +trArrayList.size() +"\"><b>" +caption + "</b></td>");
		sBuffer.append("</tr>\n");
		sBuffer.append("<tr>\n");

		Iterator iterator = trArrayList.iterator();
		while (iterator.hasNext()) {
			Item item = (Item)iterator.next();
			sBuffer.append(item.makeHTML());
		}
		sBuffer.append("</tr></table>\n");
		sBuffer.append("</td>\n");
		return sBuffer.toString();
	}
}
