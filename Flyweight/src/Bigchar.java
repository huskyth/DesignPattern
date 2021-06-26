import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Bigchar {
private char charname;
private String fontdata;
public Bigchar(char charname) {
	// TODO Auto-generated constructor stub
	this.charname = charname;
	try {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("E:\\Eclipse\\workspace\\Flyweight\\src\\" + "big"+charname+".txt"));
		String line;
		StringBuffer sBuffer = new StringBuffer();
		while((line = bufferedReader.readLine()) != null) {
			sBuffer.append(line);
			sBuffer.append("\n");
		}
		bufferedReader.close();
		this.fontdata = sBuffer.toString();
			
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		this.fontdata = charname + "?";
		e.printStackTrace();
	}
	
	
}


public void print() {
	System.out.println(fontdata);
}
}
