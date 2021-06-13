
public class Main {
	public static void main(String[] args) {
//		Display s1 = new StringDisplay("hello world!");
//		Display s2 = new UpdoenBorder(s1,'@');
//		Display s3 = new Fullorder(s2);
//		
//		s1.show();
//		s2.show();
//		s3.show();
//		
//		Display s4 = new Fullorder(
//						new UpdoenBorder(
//								new SideBorder(
//										new UpdoenBorder(
//												new SideBorder(
//														new StringDisplay("test"),'*'
//														), '='
//												),'|'
//										),'/'
//								)
//						);
//		s4.show();
		MultiStringDisplay multiStringDisplay = new MultiStringDisplay();
		multiStringDisplay.add("早上好");
		multiStringDisplay.add("晚上好");
		multiStringDisplay.add("晚安，明天见");
		multiStringDisplay.show();
		
		Display display = new SideBorder(multiStringDisplay,'#');
		display.show();
		
		Display display2 = new Fullorder(multiStringDisplay);
		display2.show();
		
		
		
		
	}

}
