import java.awt.image.AreaAveragingScaleFilter;

public class Main {
	public static BigString[] bsarray = new BigString[1000];
	public static void main(String[] args) {
		
//		if(args.length == 0) {
//			System.out.println("Usage: java Main 2324");
//			System.exit(0);
//		}
//		BigString bs = new BigString(args[0]);
//		bs.print();
		System.out.println("����ʱ:");
		testAllocation(true);
		System.out.println("�ǹ���ʱ:");
		testAllocation(false);
	}
	public static void testAllocation(boolean shared) {
		for (int i = 0; i < bsarray.length; i++) {
			bsarray[i] = new BigString("3838",shared);
			
		}
		showMemory();
	}
	
	public static void showMemory() {
		Runtime.getRuntime().gc();
		long used = Runtime.getRuntime().totalMemory()  - Runtime.getRuntime().freeMemory();
		System.out.println("ʹ���ڴ�:"+ used);
	}

}
