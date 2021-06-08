import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class FrameBuilder extends Builder implements ActionListener{

	private JFrame j = new JFrame();
	private Box b = new Box(BoxLayout.Y_AXIS);
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.getActionCommand());
	}

	@Override
	protected void buildTitle(String title) {
		// TODO Auto-generated method stub
		j.setTitle(title);
	}

	@Override
	protected void buildString(String str) {
		// TODO Auto-generated method stub
		b.add(new Label(str));
	}

	@Override
	protected void buildItem(String[] item) {
		// TODO Auto-generated method stub
		Box binner = new Box(BoxLayout.Y_AXIS);
		for (int i = 0; i < item.length; i++) {
			JButton jButton = new JButton(item[i]);
			jButton.addActionListener(this);
			binner.add(jButton);
		}
		b.add(binner);
	}

	@Override
	protected void buildDone() {
		// TODO Auto-generated method stub
		j.getContentPane().add(b);
		j.pack();
		j.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
	}

	public JFrame getResult() {
		return j;
	}
	
}
