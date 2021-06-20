import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends Frame implements ActionListener,Mediator{
	
	private ColleagueCheckoutBox checkGuest;
	private ColleagueCheckoutBox checkLogin;
	
	private ColleagueTextfield textUser;
	private ColleagueTextfield textPass;
	
	private ColleagueButton buttonOk;
	private ColleagueButton buttonCancel;

	
	
	public LoginFrame(String title) {
		// TODO Auto-generated constructor stub
		super(title);
		setBackground(Color.lightGray);
		setLayout(new GridLayout(4,2));
		createColleagues();
		add(checkGuest);
		add(checkLogin);
		add(new Label("Username:"));
		add(textUser);
		add(new Label("Password:"));
		add(textPass);	
		add(buttonOk);
		add(buttonCancel);
		colleaguesChanged();
		pack();
		show();
	}
	
	@Override
	public void createColleagues() {
		// TODO Auto-generated method stub
		CheckboxGroup group = new CheckboxGroup();
		checkGuest = new ColleagueCheckoutBox("Guest", group, true);
		checkLogin = new ColleagueCheckoutBox("Login", group, false);
		textUser = new ColleagueTextfield("", 10);
		textPass = new ColleagueTextfield("", 10);
		textPass.setEchoChar('*');
		buttonOk = new ColleagueButton("OK");
		buttonCancel = new ColleagueButton("Cancel");
		
		checkGuest.setMediator(this);
		checkLogin.setMediator(this);
		textUser.setMediator(this);
		textPass.setMediator(this);
		buttonOk.setMediator(this);
		buttonCancel.setMediator(this);
		
		checkGuest.addItemListener(checkGuest);
		checkLogin.addItemListener(checkLogin);
		textUser.addTextListener(textUser);
		textPass.addTextListener(textPass);
		buttonOk.addActionListener(this);
		buttonCancel.addActionListener(this);
	}

	@Override
	public void colleaguesChanged() {
		// TODO Auto-generated method stub
		if(checkGuest.getState()) {
			textUser.setCollearueEnabled(false);
			textPass.setCollearueEnabled(false);
			textPass.setCollearueEnabled(true);
		}else {
			textUser.setCollearueEnabled(true);
			userpassChanged();
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println(e.toString());
		System.exit(0);
	}
	
	private void userpassChanged() {
		if(textUser.getText().length() > 0) {
			textPass.setEnabled(true);
			if(textPass.getText().length()  >= 4 && textUser.getText().length() >= 4) {
				buttonOk.setEnabled(true);
			}else {
				buttonOk.setEnabled(false);
			}
		}else {
			textPass.setCollearueEnabled(false);
			buttonOk.setCollearueEnabled(false);
		}
	}
	
	
}