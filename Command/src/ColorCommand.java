


import java.awt.Color;
import java.awt.Point;

public class ColorCommand implements Command{
	protected Drawable drawable;
	private Color color;
	
	
	
	
	public ColorCommand(Drawable drawable, Color color) {
		this.drawable = drawable;
		this.color = color;
	}




	@Override
	public void execute() {
		// TODO Auto-generated method stub
		drawable.setColor(color);
	}

}

