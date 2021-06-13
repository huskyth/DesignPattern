import java.util.Iterator;

public class SizeVistor extends Visitor{
	private int size = 0;
	
	public int getSize() {
		return size;
	}

	@Override
	public void visit(File file) {
		// TODO Auto-generated method stub
		size += file.getSize();
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
