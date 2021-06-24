
public class NightState implements State {

	private static NightState singleton = new NightState();
	private  NightState() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void doClock(Context context, int hour) {
		// TODO Auto-generated method stub
		if(hour >= 12 && hour < 13) {
			context.changeState(DayState.getIntance());
		} else if(9<= hour &&  hour< 17) {
			context.changeState(DayState.getIntance());
		}
		
	}
	public static State getIntance() {
		return singleton;
	}

	@Override
	public void doUse(Context context) {
		// TODO Auto-generated method stub
		context.recoedLog("紧急，晚上使用金库");
	}

	@Override
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("按下警铃(晚上)");
		context.changeState(UrgentState.getIntance());
	}

	@Override
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("正在通话(晚上)");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[白天] " ;
	}

}
