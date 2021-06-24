import java.awt.Frame;

public class Main {
	public static void main(String[] args) {
		SafeFrame dFrame = new SafeFrame("State Sample");
		while (true) {
			for (int i = 0; i < 24; i++) {
				dFrame.setClock(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}
	}
}
