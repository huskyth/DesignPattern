
public class DecorateDisplay extends CountDisplay{
	private int step;
	public DecorateDisplay(DisplayImpl imp,int step) {
		super(imp);
		this.step = step;
	}
	
	public void increaseDisplay(int level) {
		int count = 0;
		for (int i = 0; i < level; i++) {
			multiDisplay(count);
			count += step;
		}
	}
}
