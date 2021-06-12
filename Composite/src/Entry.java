
public abstract class Entry {
	protected Entry parent;
	public abstract String getName();
	public abstract int getSize();
	public Entry add(Entry entry) throws FileTreatmentException{
		throw new FileTreatmentException();
	}
	public void printList() {
		printList("");
	}
	protected abstract void printList(String prefix);
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getName() + "(" +  getSize() + ")";
	}
	
	public String getFullName() {
		StringBuffer stringBuffer = new StringBuffer();
		Entry entry = this;
		do {
			stringBuffer.insert(0,"/" + entry.getName());
			entry = entry.parent;
			
		}while (entry != null);
		return stringBuffer.toString();
	}
}
