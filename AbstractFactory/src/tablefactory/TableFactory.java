package tablefactory;

import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;
import listfactory.LIstLInk;
import listfactory.LIstTray;
import listfactory.ListPage;



public class TableFactory extends Factory{

	@Override
	public Link createLink(String caption, String link) {
		// TODO Auto-generated method stub
		return new TableLink(caption,link);
	}

	@Override
	public Tray createTray(String caption) {
		// TODO Auto-generated method stub
		return new TableTray(caption);
	}

	@Override
	public Page createPage(String title, String author) {
		// TODO Auto-generated method stub
		return new TablePage(title,author);
	}

}
