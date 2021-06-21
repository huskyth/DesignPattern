
public class IncreamentNumberGenerator extends NumberGenerator{
	private int number;
	private int end;
	private int inc;
	
	public IncreamentNumberGenerator(int number,int end,int inc) {
		// TODO Auto-generated constructor stub
		this.number  = number;
		this.end = end;
		this.inc = inc;
	}

	@Override
	public int getNumber() {
		// TODO Auto-generated method stub
		return number;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		while (number < end) {
			notifyObservers();
			number += inc;
		}
	}
}
