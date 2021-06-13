
public class UpdoenBorder extends Border{
	private char borderChar;
	public UpdoenBorder(Display display,char bord) {
		super(display);
		// TODO Auto-generated constructor stub
		this.borderChar = bord;
	}
	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return display.getColumns();
	}
	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return display.getRows() +2;
	}
	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		String topAndBottom = makeline(borderChar,display.getColumns());
		if(row == 0 || row == getRows() - 1) {
			return topAndBottom;
		}else {
			return display.getRowText(row - 1);
		}
	}

	private String makeline(char ch,int count) {
		StringBuffer sBuffer = new StringBuffer();
		for (int i = 0; i < count; i++) {
			sBuffer.append(ch);
		}
		return sBuffer.toString();
	}
}
