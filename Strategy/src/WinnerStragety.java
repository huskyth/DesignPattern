import java.util.Random;

import org.omg.PortableServer.POAPackage.WrongAdapter;

public class WinnerStragety implements Strategy{
	private Random random;
	private boolean won = false;
	private Hand preHand;
	
	public WinnerStragety(int seed) {
		// TODO Auto-generated constructor stub
		random = new Random(seed);
	}
	
	
	@Override
	public Hand nextHand() {
		// TODO Auto-generated method stub
		if(!won) {
			preHand = Hand.getHand(random.nextInt(3));
		}
		return preHand;
	}

	@Override
	public void study(boolean win) {
		// TODO Auto-generated method stub
		won = win;
	}

}
