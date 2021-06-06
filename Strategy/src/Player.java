
public class Player {
	private String name;
	private Strategy strategy;
	private int wincount;
	private int losecount;
	private int gamecount;
	public Player(String name,Strategy strategy) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.strategy = strategy;
	}
	
	public Hand nextHand() {
		return strategy.nextHand();
	}
	
	public void win() {
		strategy.study(true);
		wincount++;
		gamecount++;
	}
	
	public void lose() {
		strategy.study(false);
		losecount++;
		gamecount++;
	}
	
	public void even() {
		gamecount++;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[" + name + ":" + gamecount + " games, " + wincount + " win, " + losecount + " lose," + "]";
	}
	
	
	
}
