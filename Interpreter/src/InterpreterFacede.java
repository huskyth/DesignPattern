

public class InterpreterFacede implements Executor{
	private ExecutorFactory executorFactory;
	private Context context;
	private Node programNode;
	public InterpreterFacede(ExecutorFactory executorFactory) {
		// TODO Auto-generated constructor stub
		this.executorFactory = executorFactory;
	}
	
	public boolean parse(String text) {
		boolean ok = true;
		this.context = new Context(text);
		this.context.setExecutorFactory(executorFactory);
		this.programNode = new PragramNode();
		try {
			programNode.parse(context);
			System.out.println(programNode.toString());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			ok = false;
		}
		return ok;	
	}
	
	public void execute() throws ExecuteException {
		programNode.execute();
		
	}

}
