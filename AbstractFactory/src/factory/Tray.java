package factory;

import java.util.ArrayList;

public abstract class Tray extends Item{
	protected ArrayList trArrayList = new ArrayList<>();
	public Tray(String caption) {
		super(caption);
		// TODO Auto-generated constructor stub
	}
	
	public void add(Item item) {
		trArrayList.add(item);
	}
}
