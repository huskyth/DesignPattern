
import java.awt.image.AreaAveragingScaleFilter;

import factory.Factory;
import factory.Link;
import factory.Page;
import factory.Tray;

public class Main {
	public static void main(String[] args) {
//		if(args.length != 1) {
//			System.out.println("Usage :java Main class.name.of.ConcreteFactory");
//			System.out.println("Example 1: java Main listfactory.Listfactory");
//			System.out.println("Example 2: java Main tablefactory.Tablefactory");
//			System.exit(0);
//		}
//		
		Factory factory = Factory.getFactory(args[0]);
		Page page = factory.createYAHoo();
		page.output();
		

//	Factory factory = Factory.getFactory(args[0]);
//	
//	Link people = factory.createLink("�����ձ�", "http://www.people.com.cn");
//	
//	Link gmw = factory.createLink("�����ձ�", "http://www.gmw.cn");
//	
//	Tray traynews = factory.createTray("�ձ�");
//	traynews.add(people);
//	traynews.add(gmw);
//	
//		Page page = factory.createPage("LinkPage", "������");
//		page.add(traynews);
//		page.output();
		
			
	}
}
