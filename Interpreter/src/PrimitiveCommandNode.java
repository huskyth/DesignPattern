
public class PrimitiveCommandNode extends Node{
	private String name;
	private Executor exe;

	@Override
	public void parse(Context context) throws ParseException {
		// TODO Auto-generated method stub
		name = context.currentToken();
		context.skipToken(name);
//		if(!name.equals("go") && !name.equals("right") && !name.equals("left") ) {
//			throw new ParseException(name + " is undefine");
//		}
		exe = context.createExecutor(name);
		
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
	public void execute() throws ExecuteException{
		if(exe == null) {
			throw new ExecuteException(name+" is not defined");
		}else {
			exe.execute();
		}
		
	}

}
