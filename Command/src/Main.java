import java.awt.Canvas;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Main extends JFrame implements ActionListener{
	private MacroCommand history = new MacroCommand();
	private DrawCanvas canvas = new DrawCanvas(400, 400, history);
	private JButton clearButton = new JButton("clear");
	
	private JButton blueButton = new JButton("blue");
	private JButton undoButton = new JButton("undo");
	public Main(String title) {
		super(title);
		// TODO Auto-generated constructor stub
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}

		});
		canvas.addMouseMotionListener(new MouseMotionAdapter() {
			public void mouseDragged(MouseEvent mouseEvent) {
				Command command = new DrawCommand(canvas,mouseEvent.getPoint());
				history.append(command);
				command.execute();
			}
		});
		clearButton.addActionListener(this);
		
		blueButton.addActionListener(this);
		undoButton.addActionListener(this);
		
		Box buttonBox = new Box(BoxLayout.X_AXIS);
		buttonBox.add(clearButton);
		buttonBox.add(blueButton);
		buttonBox.add(undoButton);
		Box mainBox = new Box(BoxLayout.Y_AXIS);
		mainBox.add(buttonBox);
		mainBox.add(canvas);
		getContentPane().add(mainBox);
		pack();
		show();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == clearButton) {
			history.clear();
			canvas.repaint();
			canvas.init();
		}else if(e.getSource() == blueButton) {
			Command command = new ColorCommand(canvas,Color.blue);
			history.append(command);
			command.execute();
			
		}
		else if(e.getSource() == undoButton) {
			history.undo();
			canvas.repaint();
			
		}
	}
	public static void main(String[] args) {
		new Main("Command and Pattern");
	}

}
