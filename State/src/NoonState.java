import javax.net.ssl.HostnameVerifier;

public class NoonState implements State {

	private static NoonState singleton = new NoonState();
	private  NoonState() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public void doClock(Context context, int hour) {
		// TODO Auto-generated method stub
		if(hour >= 17 || hour < 9) {
			context.changeState(NightState.getIntance());
		} else if(9<= hour &&  hour< 12 || 13 <= hour && hour <17) {
			context.changeState(DayState.getIntance());
		}
		
	}
	public static State getIntance() {
		return singleton;
	}

	@Override
	public void doUse(Context context) {
		// TODO Auto-generated method stub
		context.recoedLog("���������ʹ�ý��");
	}

	@Override
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("���¾���(���)");
	}

	@Override
	public void doPhone(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("����ͨ��(���)");
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[���] " ;
	}

}
