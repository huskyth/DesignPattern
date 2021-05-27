package issue;

import java.io.*;
import java.util.*;

public class FileProperties extends Properties implements FileIO{
	
	@Override
	public void readFromFile(String filename) throws IOException {
		load(new FileInputStream(filename));
	}

	@Override
	public void writeToFile(String filename) throws IOException {
		store(new FileOutputStream(filename),"write by FileProperties");
	}

	@Override
	public void setValue(String key, String value) throws IOException {
		setProperty(key, value);
	}

	@Override
	public String getValue(String key) {
		return getProperty(key);
	}
}
