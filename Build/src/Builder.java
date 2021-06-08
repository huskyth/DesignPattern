
public abstract class Builder {
	private boolean initialize = false;
	public void makeTitle(String title) {
		if(!initialize) {
			buildTitle(title);
			initialize = true;
		}
	}
	public void makeString(String str) {
		if(initialize) {
			buildString(str);
		}
	}
	public void makeItems(String[] item) {
		if(initialize) {
			buildItem(item);
		}
	}
	public void close() {
		if(initialize) {
			buildDone();
		}
	}
	
	protected abstract void buildTitle(String title);
	protected abstract void buildString(String title);
	protected abstract void buildItem(String[] item);
	protected abstract void buildDone();
	
}
