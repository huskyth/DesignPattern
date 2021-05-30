
public class TicketMaker {
	private int ticket = 1000;
	private static TicketMaker ticketMaker = new TicketMaker();
	public synchronized int getNextTicketMaker() {
		return ticket++;
	}
	private TicketMaker() {
		
	}
	
	public static TicketMaker geTicketMakerInstance() {
		return ticketMaker;
	}

}
