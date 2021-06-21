
public class Main {
	public static void main(String[] args) {
//		NumberGenerator nGenerator = new RandomNumberGenerator();
		NumberGenerator generator = new IncreamentNumberGenerator(10,20,1);
		Observer s1 = new DigitObserver();
		Observer s2 = new GraphObserver();
		Observer s3 = new FrameObserver();
		generator.addObserver(s1);
		generator.addObserver(s2);
		generator.addObserver(s3);
		generator.execute();
	}
}
