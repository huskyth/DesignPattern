package factory;

public abstract class Factory {
	public static Factory getFactory(String classname) {
		Factory factory = null;
		
		try {
			factory = (Factory)Class.forName(classname).newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return factory;
	}
	public abstract Link createLink(String caption,String link);
	public abstract Tray createTray(String caption);
	public abstract Page createPage(String title,String author);
	
	public Page createYAHoo() {
		Link link = createLink("YaHoo", "http://www.yahoo.com");
		Page page = createPage("YaHoo", "YaHoo");
		page.add(link);
		return page;
	}
	
	
}
