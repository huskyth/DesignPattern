
import java.util.Iterator;

public class ListVisitor extends Visitor{
	private String currentDir = "";
	@Override
	public void visit(File file) {
		// TODO Auto-generated method stub
		System.out.println(currentDir + "/" + file);
	}

	@Override
	public void visit(Directory dir) {
		// TODO Auto-generated method stub
		System.out.println(currentDir + "/" + dir);
		String saveDir = currentDir;
		
		currentDir = currentDir + "/" + dir.getName();
		Iterator iterator = dir.iterator();
		while (iterator.hasNext()) {
			Entry entry = (Entry)iterator.next();
			entry.accept(this);
		}
		currentDir = saveDir;
	}

}
