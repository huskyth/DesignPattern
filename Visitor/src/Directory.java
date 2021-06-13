import java.util.ArrayList;
import java.util.Iterator;

public class Directory extends Entry{
	private String name;
	private ArrayList directory = new ArrayList<>();
	
	public Directory(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
//		int size = 0;
//		Iterator iterator = directory.iterator();
//		while (iterator.hasNext()) {
//			Entry entry = (Entry)iterator.next();
//			size += entry.getSize();
//		}
//		return size;
		SizeVistor sizeVistor = new SizeVistor();
		accept(sizeVistor);
		return sizeVistor.getSize();
	}

	
	public Entry add(Entry entry) {
		directory.add(entry);
		return this;
	}
	
	@Override
	public Iterator iterator()  {
		// TODO Auto-generated method stub
		return directory.iterator();
	}
	
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		v.visit(this);
	}
	


}
