import java.util.ArrayList;
import java.util.Iterator;

public class ElementArrayList extends ArrayList implements Element{

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		Iterator iterator = iterator();
		while (iterator.hasNext()) {
			Element entry = (Element) iterator.next();
			entry.accept(v);
		}
		
	}

}
