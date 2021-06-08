import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.ObjectInputStream.GetField;

public class HTMLBuilder extends Builder {
	private String filename;
	private PrintWriter pw;
	@Override
	public void buildTitle(String title) {
		// TODO Auto-generated method stub
		filename = title+".html";
		try {
			pw = new PrintWriter(new FileWriter(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		pw.println("<html><head><title>" + title + "</title></head></html>");
		pw.println("<h1>" + title + "</h1>");
	}

	@Override
	public void buildString(String str) {
		// TODO Auto-generated method stub
		pw.println("<p>" + str + "</p>");
	}

	@Override
	public void buildItem(String[] item) {
		// TODO Auto-generated method stub
		pw.println("<ul>");
		for (int i = 0; i < item.length; i++) {
			pw.println("<li>" + item[i] + "</li>");
		}
		pw.println("</ul>");
	}

	@Override
	public void buildDone() {
		// TODO Auto-generated method stub
		pw.println("</body></html>");
		pw.close();
	}
	
	public String getresult() {
		return filename;
	}
	
}
