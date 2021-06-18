package pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Enumeration;
import java.util.Properties;

public class PageMaker {
	private PageMaker() {
		
	}
	public static void makeWelcomePage(String mailaddr,String filename) {
		Properties properties = Database.getProperties("maildata");
		String username = properties.getProperty(mailaddr);
		try {
			HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(filename));
			htmlWriter.title("Welcome to" + username + "'s page");
			htmlWriter.paragraph(username + "欢迎来到"+username + " 的主页");
			htmlWriter.paragraph("等着你的邮件");
			htmlWriter.mailto(mailaddr, username);
			htmlWriter.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(filename + " is created for " +mailaddr + "(" + username + ")");
	}
	
	public static void makeLinkPage(String name) {
		HtmlWriter htmlWriter;
		try {
			htmlWriter = new HtmlWriter(new FileWriter(name));
			htmlWriter.title("link page");
			Properties properties=  Database.getProperties("maildata");
			Enumeration  enumeration = properties.propertyNames();
			while (enumeration.hasMoreElements()) {
				String addr = (String) enumeration.nextElement();
				String username = properties.getProperty(addr,"unknow");
				htmlWriter.mailto(addr, username);
			}
			htmlWriter.close();
			System.out.println(name + "is created");
			
			
			
			
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
