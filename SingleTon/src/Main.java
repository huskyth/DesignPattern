import java.awt.font.TransformAttribute;

public class Main  extends Thread{
	public static void main(String[] args) {
//		System.out.println("start.");
//		Singleton s1 = Singleton.getInstance();
//		Singleton s2 = Singleton.getInstance();
//		if(s1 == s2) {
//			System.out.println("s1与s2是相同的实例");
//		}else {
//			System.out.println("s1与s2是不同的实例");
//		}
//		System.out.println("end.");
//		TicketMaker ticketMaker = TicketMaker.geTicketMakerInstance();
//		int next = ticketMaker.getNextTicketMaker();
//		System.out.print(next);
	
//		for (int i = 0; i < 9; i++) {
//			Triple triple = Triple.getInstance(i % 3);
//			System.out.println(i+":"+triple);
//		}
		
//	for (int i = 0; i < 10; i++) {
//		System.out.println(i+":"+TicketMaker.geTicketMakerInstance().getNextTicketMaker());
//	}

		
		new Main("A").start();
		new Main("B").start();
		new Main("C").start();
		
	}
	
	@Override
	public void run() {
		super.run();
		Singleton singleton = Singleton.getInstance();
		System.out.println(getName() +":obj=" +singleton);
	}
	
	public Main(String name) {
		super(name);
	}

}
