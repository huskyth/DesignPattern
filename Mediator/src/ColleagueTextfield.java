import java.awt.Color;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

public class ColleagueTextfield extends TextField implements TextListener,Colleague{

	private Mediator med;
	
	public ColleagueTextfield(String text,int column) {
		// TODO Auto-generated constructor stub
		super(text,column);
	}
	
	
	@Override
	public void setMediator(Mediator mediator) {
		// TODO Auto-generated method stub
		this.med = mediator;
	}

	@Override
	public void setCollearueEnabled(Boolean enabled) {
		// TODO Auto-generated method stub
		setEnabled(enabled);
		setBackground(enabled?Color.WHITE:Color.LIGHT_GRAY);
	}

	@Override
	public void textValueChanged(TextEvent e) {
		// TODO Auto-generated method stub
		med.colleaguesChanged();
	}

}
