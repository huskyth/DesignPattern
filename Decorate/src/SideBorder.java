
public class SideBorder extends Border{
	private char borderChar;
	public SideBorder(Display display,char bord) {
		super(display);
		// TODO Auto-generated constructor stub
		this.borderChar = bord;
	}
	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return display.getColumns() +2;
	}
	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return display.getRows();
	}
	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		return borderChar +display.getRowText(row) +borderChar;
	}

}
