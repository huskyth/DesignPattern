import java.util.ArrayList;
import java.util.Iterator;

import javax.sql.RowSetInternal;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

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
		int size = 0;
		Iterator iterator = directory.iterator();
		while (iterator.hasNext()) {
			Entry entry = (Entry)iterator.next();
			size += entry.getSize();
			
		}
		return size;
	}

	
	public Entry add(Entry entry) {
		directory.add(entry);
		entry.parent= this;
		return this;
		
	}
	@Override
	protected void printList(String prefix) {
		// TODO Auto-generated method stub
		System.out.println(prefix + "/" + this);
		Iterator iterator = directory.iterator();
		while (iterator.hasNext()) {
			Entry entry = (Entry)iterator.next();
			entry.printList(prefix + "/" + name);
		}
	}



}
