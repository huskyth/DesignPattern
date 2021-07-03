import java.awt.List;

import java.util.ArrayList;
import java.util.Iterator;

public class CommandListNode extends Node{
	private ArrayList list = new ArrayList<>();

	@Override
	public void parse(Context context) throws ParseException {
		// TODO Auto-generated method stub
		while (true) {
			if(context.currentToken() == null) {
				throw new ParseException("missing end");
			}else if(context.currentToken().equals("end")) {
				context.skipToken("end");
				break;
			}else {
				Node commandNode = new CommandNode();
				commandNode.parse(context);
				list.add(commandNode);
			}
			
		}
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return list.toString();
	}
	
	
	public void execute() throws ExecuteException{
		Iterator iterator = list.iterator();
		while (iterator.hasNext()) {
			((CommandNode)iterator.next()).execute();
			
		}
	}

}
