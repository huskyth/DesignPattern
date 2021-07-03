
import java.util.StringTokenizer;

public class Context implements ExecutorFactory{
	private ExecutorFactory executorFactory;
	private StringTokenizer stringTokenizer;
	private String  currentToken;
	
	public Context(String text) {
		// TODO Auto-generated constructor stub
		
		stringTokenizer = new StringTokenizer(text);
		nextToken();
	}
	public String currentToken() {
		return currentToken;
	}
	
	public String nextToken() {
		if(stringTokenizer.hasMoreTokens()) {
			currentToken = stringTokenizer.nextToken();
		}else {
			currentToken = null;
		}
		return currentToken;
	}
	
	public void skipToken(String token) throws ParseException {
		if(!token.equals(currentToken)) {
			throw new ParseException("warning " + token +  " is expected,but " + currentToken + " is found " );
		}
		nextToken();
	}
	
	public int currentNumber() throws ParseException{
		int number = 0;
		try {
			number = Integer.parseInt(currentToken);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			throw new ParseException("warning " + e);
		}
		return number;
	}
	
	public void setExecutorFactory(ExecutorFactory executorFactory) {
		this.executorFactory = executorFactory;
	}
	@Override
	public Executor createExecutor(String name) {
		// TODO Auto-generated method stub
		return executorFactory.createExecutor(name);
	}
}
