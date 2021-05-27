package issue;

import java.io.IOException;

public class Main {
	public static void main(String[] args) {
		FileIO fIo = new FileProperties();
		try {
			fIo.readFromFile("C:\\Users\\Administrator\\Desktop\\DesignPattern\\Adapter\\src\\issue\\file.txt");
			fIo.setValue("year", "2021");
			fIo.setValue("month", "5");
			fIo.setValue("day", "27");
			fIo.writeToFile("C:\\Users\\Administrator\\Desktop\\DesignPattern\\Adapter\\src\\issue\\newfile.txt");
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
