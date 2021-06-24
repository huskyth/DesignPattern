


public class UrgentState implements State {

	private static UrgentState singleton = new UrgentState();
	private  UrgentState() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void doClock(Context context, int hour) {
	
		
	}
	public static State getIntance() {
		return singleton;
	}

	@Override
	public void doUse(Context context) {
		// TODO Auto-generated method stub
		context.recoedLog("紧急使用金库");
	}

	@Override
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("按下警铃(紧急)");
	}

	@Override
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("正在通话(紧急)");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[紧急] " ;
	}

}
