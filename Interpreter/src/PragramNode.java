import java.util.Iterator;

public class PragramNode extends Node {

	private Node commandListNode;
	@Override
	public void parse(Context context) throws ParseException {
		// TODO Auto-generated method stub
		context.skipToken("program");
		commandListNode = new CommandListNode();
		commandListNode.parse(context);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[program " + commandListNode +"]";
	}
	
	public void execute() throws ExecuteException{
		commandListNode.execute();
	}

}
