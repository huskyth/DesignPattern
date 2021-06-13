import java.util.Iterator;

import org.omg.CosNaming.NamingContextExtPackage.AddressHelper;

public abstract class Entry implements Element{
	public abstract String getName(); 
	public abstract int getSize(); 
	public Entry add(Entry entry) throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	
	public Iterator iterator()  throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + "(" + getSize() + ")";
	}
	
	
	
	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

}
