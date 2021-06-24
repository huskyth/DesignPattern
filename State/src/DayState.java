
public class DayState implements State {

	private static DayState singleton = new DayState();
	private DayState() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void doClock(Context context, int hour) {
		// TODO Auto-generated method stub
		if(hour < 9 || hour >= 17) {
			context.changeState(NightState.getIntance());
		}else if(12<= hour &&  hour< 13) {
			context.changeState(NoonState.getIntance());
		}
		
	}
	public static State getIntance() {
		return singleton;
	}

	@Override
	public void doUse(Context context) {
		// TODO Auto-generated method stub
		context.recoedLog("使用金库（白天）");
	}

	@Override
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("按下警铃(白天)");
		context.changeState(UrgentState.getIntance());
	}

	@Override
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("正在通话(白天)");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[白天] " ;
	}

}
