import java.util.ArrayList;
import java.util.Iterator;

public class FileFindVistor extends Visitor {

	private String filetype;
	private ArrayList found = new ArrayList<>();
	public FileFindVistor(String filetype) {
		this.filetype = filetype;
		// TODO Auto-generated constructor stub
	}
	
	public Iterator getFoundFiles() {
		return found.iterator();
	}
	
	
	@Override
	public void visit(File file) {
		// TODO Auto-generated method stub
		if(file.getName().endsWith(filetype)) {
			found.add(file);
		}
		
	}

	@Override
	public void visit(Directory dir) {
		// TODO Auto-generated method stub
		Iterator iterator = dir.iterator();
		while (iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			entry.accept(this);
		}
	}
}
