import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.Action;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Main extends Frame implements ActionListener{
	private TurtleCanvas turtleCanvas = new TurtleCanvas(400, 400);
	private InterpreterFacede fecade = new InterpreterFacede(turtleCanvas);
	private TextField textField = new TextField("program repeat 3 go right go right end end");
	
	public Main(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		turtleCanvas.setExecutor(fecade);
		setLayout(new BorderLayout());
		textField.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		add(textField,BorderLayout.NORTH);
		add(turtleCanvas,BorderLayout.CENTER);
		pack();
		parseAndExecute();
		show();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == textField) {
			parseAndExecute();
		}
		
	}
	
	public void parseAndExecute() {
		String prot = textField.getText();
		System.out.println("protext = " + prot);
		fecade.parse(prot);
		turtleCanvas.repaint();
	}
	
	

//	public static void main(String[] args) {
//
//		try {
//			BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\Eclipse\\workspace\\Interpreter\\src\\program.txt"));
//			String text;
//			while ((text = bufferedReader.readLine()) != null) {
//				System.out.println("text = \"" + text + "\"");
//				Node node = new PragramNode();
//				node.parse(new Context(text));
//				System.out.println("node =  " + node);
//				
//			}
//			bufferedReader.close();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
//	
	public static void main(String[] args) {
		new Main("Interpreter pattern sample");
	}

}
