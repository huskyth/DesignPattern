import java.util.Iterator;

public class CommandNode extends Node{
	private Node node;

	@Override
	public void parse(Context context) throws ParseException {
		// TODO Auto-generated method stub
		
		if(context.currentToken().equals("repeat")) {
			node = new RepeatCommandNode();
			node.parse(context);
		}else {
			node = new PrimitiveCommandNode();
			node.parse(context);
		}
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return node.toString();
	}
	
	public void execute() throws ExecuteException{
		node.execute();
	}
}
