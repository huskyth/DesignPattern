
public class Fullorder extends Border{

	public Fullorder(Display display) {
		super(display);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getColumns() {
		// TODO Auto-generated method stub
		return display.getColumns() +2;
	}

	@Override
	public int getRows() {
		// TODO Auto-generated method stub
		return display.getRows() +2;
	}

	@Override
	public String getRowText(int row) {
		// TODO Auto-generated method stub
		if(row == 0) {
			return "+" + makeline('-',display.getColumns()) + "+";
		}else if (row == display.getRows() + 1) {
			return "+" + makeline('-',display.getColumns()) + "+";
		}else {
			return "|" + display.getRowText(row-1) + "|";
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
