
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
		context.recoedLog("����������ʹ�ý��");
	}

	@Override
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("���¾���(����)");
		context.changeState(UrgentState.getIntance());
	}

	@Override
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("����ͨ��(����)");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[����] " ;
	}

}
