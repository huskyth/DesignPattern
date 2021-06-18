package pagemaker;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

class Database {
	private Database() {
		// TODO Auto-generated constructor stub
	}
	
	public static Properties getProperties(String dbname) {
		String filename = dbname + ".txt";
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("E:\\Eclipse\\workspace\\Facede\\src\\" +filename));
		}  catch (IOException e) {
			System.out.println("Warning:"+filename + " not found");
			e.printStackTrace();
		}
		return properties;
	}
}
