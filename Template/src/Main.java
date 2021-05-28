
public class Main {
	public static void main(String[] args) {
		AbstractDisplay a1 = new CharDisplay('t');
		AbstractDisplay a2 = new StringDisplay("Hello World!");
		AbstractDisplay a3 = new StringDisplay("Hello World! My guys");
		a1.display();
		a2.display();
		a3.display();
	}

}
