


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
		context.recoedLog("����ʹ�ý��");
	}

	@Override
	public void doAlarm(Context context) {
		// TODO Auto-generated method stub
		context.callSecurityCenter("���¾���(����)");
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
