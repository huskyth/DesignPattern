import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		
		try {

//			System.out.println("making root dirs");
//			Directory root = new Directory("rootdir");
//			Directory bin = new Directory("bindir");
//			Directory tmp = new Directory("tmpdir");
//			Directory usr = new Directory("usrdir");
//			
//			root.add(bin);
//			root.add(tmp);
//			root.add(usr);
//			
//			bin.add(new File("vi", 10000));
//			
//			bin.add(new File("latex", 20000));
//			root.accept(new ListVisitor());
//			
//			System.out.println("");
//			System.out.println("making usr dirs");
//			
//			Directory yuki = new Directory("yuki");
//			Directory hanako = new Directory("hanako");
//			Directory tomura = new Directory("tomura");
//			usr.add(yuki);
//			usr.add(hanako);
//			usr.add(tomura);
//			
//			yuki.add(new File("diary.html", 1000));
//			yuki.add(new File("Composite.java", 200));
//			hanako.add(new File("mem.tex", 300));
//			tomura.add(new File("game.doc", 400));
//			tomura.add(new File("junk.html", 500));
			
			
			
//			FileFindVistor fileFindVistor = new FileFindVistor(".html");
//			root.accept(fileFindVistor);
//			System.out.println("HTML files are:");	
//			Iterator iterator = fileFindVistor.getFoundFiles();
//			while (iterator.hasNext()) {
//				File file = (File)iterator.next();
//				System.out.println(file.toString());
//				
//			}
//			
			Directory r1 = new Directory("r1");
			r1.add(new File("a.html", 1));
			r1.add(new File("b.html", 2));
			Directory r2 = new Directory("r2");
			r2.add(new File("a.html", 10));
			r2.add(new File("b.html", 20));
			
			ElementArrayList list = new ElementArrayList();
			list.add(r1);
			list.add(r2);
			list.add(new File("test.html", 1234));
			
			list.accept(new ListVisitor());
		} catch (FileTreatmentException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
	}
}
