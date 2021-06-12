
public class Main {
	public static void main(String[] args) {
		
		try {

			System.out.println("making root dirs");
			Directory root = new Directory("rootdir");
			Directory bin = new Directory("bindir");
			Directory tmp = new Directory("tmpdir");
			Directory usr = new Directory("usrdir");
			
			root.add(bin);
			root.add(tmp);
			root.add(usr);
			
			bin.add(new File("vi", 10000));
			
			bin.add(new File("latex", 20000));
			root.printList();
			
			System.out.println("");
			System.out.println("making usr dirs");
			
			Directory yuki = new Directory("yuki");
			Directory hanako = new Directory("hanako");
			Directory tomura = new Directory("tomura");
			usr.add(yuki);
			usr.add(hanako);
			usr.add(tomura);
			
			yuki.add(new File("diary.html", 1000));
			yuki.add(new File("Composite.java", 200));
			hanako.add(new File("mem.tex", 300));
			tomura.add(new File("game.doc", 400));
			tomura.add(new File("junk.mail", 500));
			
			
			File th = new File("tenghao", 1995);
			tomura.add(th);
			
			System.out.println("thµÄÄ¿Â¼ÊÇ£º"+th.getFullName());
			
			root.printList();
		} catch (FileTreatmentException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
	}
}
