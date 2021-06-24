import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.border.Border;

public class SafeFrame extends Frame implements ActionListener,Context{
	
	private TextField textClock = new TextField(60);
	private TextArea textSreen = new TextArea(10,60);
	private Button buttonUse= new Button("ʹ�ý��");
	private Button buttonAlarm= new Button("���¾���");
	private Button buttonPhone= new Button("����ͨ��");
	private Button buttonExit = new Button("����");
	
	private State state = DayState.getIntance();
	
	public SafeFrame(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		setBackground(Color.lightGray);
		setLayout(new BorderLayout());
		add(textClock,BorderLayout.NORTH);
		textClock.setEditable(false);
		add(textSreen,BorderLayout.CENTER);
		textSreen.setEditable(false);
		Panel panel = new Panel();
		panel.add(buttonUse);
		panel.add(buttonAlarm);
		panel.add(buttonPhone);
		panel.add(buttonExit);
		
		add(panel,BorderLayout.SOUTH);
		pack();
		show();
		buttonUse.addActionListener(this);
		buttonAlarm.addActionListener(this);
		buttonExit.addActionListener(this);
		buttonPhone.addActionListener(this);
		
		
	}
	
	
	@Override
	public void setClock(int hour) {
		// TODO Auto-generated method stub
		String clockString = "����ʱ����";
		if(hour < 10) {
			clockString += "0" + hour + ":00";
		}else {
			clockString += hour +":00";
		}
		System.out.println(clockString);
		textClock.setText(clockString);
		state.doClock(this, hour);
		
	}

	@Override
	public void changeState(State state) {
		// TODO Auto-generated method stub
		System.out.println("��" + this.state +" ״̬��Ϊ��" +state +"״̬");
		this.state = state;
	}

	@Override
	public void callSecurityCenter(String msg) {
		// TODO Auto-generated method stub
		textSreen.append("call!" + msg + "\n");
	}

	@Override
	public void recoedLog(String msg) {
		// TODO Auto-generated method stub
		textSreen.append("record ..."+ msg + "\n" );
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
		if(e.getSource() == buttonUse) {
			state.doUse(this);
		}else if(e.getSource() == buttonAlarm)
		{
			state.doAlarm(this);
		}else if(e.getSource() == buttonPhone) {
			state.doPhone(this);
		}else if(e.getSource() == buttonExit) {
			System.exit(0);
		}else
		{
			System.out.println("?");
		}
		
	}
	


}
