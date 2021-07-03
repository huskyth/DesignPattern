import java.util.Iterator;

public class RepeatCommandNode extends Node{
	private int number;
	private Node commandListNode;

	@Override
	public void parse(Context context) throws ParseException {
		// TODO Auto-generated method stub
		context.skipToken("repeat");
		number = context.currentNumber();
		context.nextToken();
		commandListNode = new CommandListNode();
		commandListNode.parse(context);
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[repeat  "+  number + " " + commandListNode + "]";
	}
	
	public void execute() throws ExecuteException{
		for (int i = 0; i < number; i++) {
			commandListNode.execute();
		}
	}

}
