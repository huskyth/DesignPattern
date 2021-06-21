import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.IconifyAction;

public class GraphCanvas extends Canvas implements Observer{
	private int number;
	
	@Override
	public void update(NumberGenerator generator) {
		// TODO Auto-generated method stub
		number = generator.getNumber();
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		int width = getWidth();
		int height = getHeight();
		g.setColor(Color.white);
		g.fillArc(0, 0, width, height, 0, 360);
		g.setColor(Color.RED);
		g.fillArc(0, 0, width, height, 90, - number * 360 / 50);
		
		
		
	}

}
