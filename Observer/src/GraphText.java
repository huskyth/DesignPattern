import java.awt.TextField;

public class GraphText extends TextField implements Observer{
	
	public GraphText(int column) {
		// TODO Auto-generated constructor stub
		super(column);
	}

	@Override
	public void update(NumberGenerator generator) {
		// TODO Auto-generated method stub
		int n = generator.getNumber();
		String text = n + ":";
		for (int i = 0; i < n; i++) {
			text += '*';
		}
		setText(text);
	}

}
