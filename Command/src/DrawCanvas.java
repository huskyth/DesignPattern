import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class DrawCanvas extends Canvas implements Drawable{
	
	private Color color;
	private int radius;
	private MacroCommand history;
	
	public DrawCanvas(int width,int height,MacroCommand history) {
		// TODO Auto-generated constructor stub
		setSize(width,height);
		setBackground(Color.white);
		this.history = history;
		init();
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		history.execute();
	}

	@Override
	public void draw(int x, int y) {
		// TODO Auto-generated method stub
		Graphics graphics = getGraphics();
		graphics.setColor(color);
		graphics.fillOval(x-radius, y-radius, radius * 2, radius * 2);
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		color = Color.red;
		radius = 6;
		history.append(new ColorCommand(this, color));
	}

	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		this.color = color;
		
	}

}
