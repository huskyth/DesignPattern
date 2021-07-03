import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.nio.file.DirectoryIteratorException;


public class TurtleCanvas extends Canvas implements ExecutorFactory{
	final static int UNIT_LENGTH=30;
	final static int DIRECT_UP=0;
	final static int DIRECT_RIGHT=3;
	final static int DIRECT_DOWN=6;
	final static int DIRECT_LEFT=9;
	final static int RELATIVE_DIRECT_RIGHT=3;
	final static int RELATIVE_DIRECT_LEFT=-3;
	final static int RADIUS=3;
	private int direction = 0;
	private Point point;
	private Executor executor;
	
	public TurtleCanvas(int width,int height) {
		// TODO Auto-generated constructor stub
		setSize(width,height);
		initialize();
	}
	public void setExecutor(Executor executor) {
		this.executor = executor;
	}
	void setRelativeDirection(int relativeDirection){
		setDirection(direction + relativeDirection);
	}
	
	void setDirection(int direction) {
		if(direction < 0) {
			direction = 12 - (-direction) % 12;
		}else {
			direction = direction %12;
		}
		this.direction = direction % 12;
		
	}
	
	void go(int length) {
		int newx = point.x;
		int newy = point.y;
		switch (direction) {
		case DIRECT_UP:
			newy-=length;
			break;
		case DIRECT_RIGHT:
			newx+=length;
			break;
		case DIRECT_DOWN:
			newx+=length;
			break;
		case DIRECT_LEFT:
			newx-=length;
			break;
		default:
			break;
		}
		Graphics graphics = getGraphics();
		if(graphics!=null) {
			graphics.drawLine(point.x, point.y, newx, newy);
			graphics.fillOval(newx-RADIUS, newy-RADIUS, RADIUS*2+1,  RADIUS*2+1);
		}
		point.x = newx;
		point.y = newy;
	}
	
	

	public Executor createExecutor(String name) {
		// TODO Auto-generated method stub
		if(name.equals("go")) {
			return new GoExecutor(this);
		}else if(name.equals("right")) {
			return new DirectionExecutor(this,RELATIVE_DIRECT_RIGHT);
		}else if(name.equals("left")) {
			return new DirectionExecutor(this,RELATIVE_DIRECT_LEFT);
		}else {
		return null;
	}
	}
	
	public void initialize() {
		Dimension size = getSize();
		point = new Point(size.width/2,size.height/2);
		direction = 0;
		setForeground(Color.red);
		setBackground(Color.white);
		Graphics g = getGraphics();
		if(g != null) {
			g.clearRect(0, 0,size.width, size.height);
		}
	}
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		initialize();
		if(executor != null) {
			try {
				executor.execute();
			} catch (ExecuteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		super.paint(g);
	}
	
	abstract class TurtleExecutor implements Executor{
		protected TurtleCanvas turtleCanvas;
		public TurtleExecutor(TurtleCanvas turtleCanvas) {
			this.turtleCanvas = turtleCanvas;
			// TODO Auto-generated constructor stub
		}
		public abstract void execute();
	}

	class GoExecutor extends TurtleExecutor{

		public GoExecutor(TurtleCanvas turtleCanvas) {
			super(turtleCanvas);
			// TODO Auto-generated constructor stub
		}



		@Override
		public void execute() {
			// TODO Auto-generated method stub
			turtleCanvas.go(TurtleCanvas.UNIT_LENGTH);
		}


	}
	
	class DirectionExecutor extends TurtleExecutor{
		private int relativeDirection;

		public DirectionExecutor(TurtleCanvas turtleCanvas,int relativeDirection) {
			super(turtleCanvas);
			// TODO Auto-generated constructor stub
			this.relativeDirection = relativeDirection;
		}



		@Override
		public void execute() {
			// TODO Auto-generated method stub
			turtleCanvas.go(TurtleCanvas.UNIT_LENGTH);
		}


	}
	
	
}
