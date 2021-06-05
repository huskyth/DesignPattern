import java.util.Random;

public class RandomCountDisplay extends CountDisplay{
	private Random random = new Random();

	public RandomCountDisplay(DisplayImpl imp) {
		super(imp);
	}

	
	public void randomDisplay(int times) {
		multiDisplay(random.nextInt(times));
	}
}
