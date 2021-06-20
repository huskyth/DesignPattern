import java.awt.Button;

public class ColleagueButton extends Button implements Colleague{
	
	private Mediator med;
	
	public ColleagueButton(String caption) {
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

}
