
public class Main {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Usage:java Main random2 random 2");
			System.out.println("Example:java Main 314 3");
			System.exit(0);
		}
		int seed1 = Integer.parseInt(args[0]);
		int seed2 = Integer.parseInt(args[1]);
		Player player1 = new Player("wang", new WinnerStragety(seed1));
		Player player2 = new Player("zhang", new ProbStrategy(seed2));	
		for (int i = 0; i < 10000; i++) {
			Hand hand1 = player1.nextHand();
			Hand hand2 = player2.nextHand();
			if(hand1.isStrongerThan(hand2)) {
				System.out.println("winner:" + player1);
				player1.win();
				player2.lose();
			}else if (hand2.isStrongerThan(hand1)) {
				System.out.println("winner:" + player2);
				player1.lose();
				player2.win();
			}else {
				System.out.println("Even...");
				player1.even();
				player2.even();
			}
		}
		System.out.println("Total result:");
		System.out.println(player1.toString());
		System.out.println(player2.toString());
		
	}

}
