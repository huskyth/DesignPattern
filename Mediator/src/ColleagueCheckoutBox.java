import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckoutBox extends Checkbox implements ItemListener,Colleague{
	private Mediator med;
	public ColleagueCheckoutBox(String caption, CheckboxGroup group, boolean state) {
		// TODO Auto-generated constructor stub
		super(caption);
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
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		med.colleaguesChanged();
	}

}
