import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.Border;

public class FrameObserver extends Frame implements Observer ,ActionListener{
	private GraphText textGraph = new GraphText(60);
	private GraphCanvas canvasGraph = new GraphCanvas();
	private Button closeButton = new Button("Close");
	
	public FrameObserver() {
		// TODO Auto-generated constructor stub
		super("FrameObserver");
		setLayout(new BorderLayout());
		setBackground(Color.lightGray);
		textGraph.setEditable(false);
		canvasGraph.setSize(500,500);
		add(textGraph,BorderLayout.NORTH);
		add(canvasGraph,BorderLayout.CENTER);
		add(closeButton,BorderLayout.SOUTH);
		closeButton.addActionListener(this);
		pack();
		show();
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
		System.exit(0);
	}

	@Override
	public void update(NumberGenerator generator) {
		// TODO Auto-generated method stub
		textGraph.update(generator);
		canvasGraph.update(generator);
	}

}
