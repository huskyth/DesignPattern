import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class FileDisplayImpl extends DisplayImpl{
	private String filename;
	private BufferedReader reader;
	private final int MAX_AHEAD_LIMIT = 4096;
	
	public FileDisplayImpl(String filename) {
		this.filename = filename;
	}
	
	@Override
	public void rawOpen() {
		try {
			reader = new BufferedReader(new FileReader(filename));
			reader.mark(MAX_AHEAD_LIMIT);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("=-=-=-=-=-=" + filename + "=-=-=-=-=-=");
	}

	@Override
	public void rawPrint() {
	    String line;

		try {
		    reader.reset();
			while ((line = reader.readLine()) != null) {
				System.out.println("> " + line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void rawClose() {
		System.out.println("=-=-=-=-=-= ");
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
