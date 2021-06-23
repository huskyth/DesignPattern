package games;
import java.awt.List;
import java.io.Serializable;
import java.util.ArrayList;

public class Memento implements Serializable {
	int money;
	ArrayList fruits;
	public int getMoney() {
		return money;
	}
	
	public Memento(int money) {
		// TODO Auto-generated constructor stub
		this.money = money;
		this.fruits = new ArrayList<>();
	}
	
	public void addFruit(String fruit) {
		fruits.add(fruit);
	}
	
	ArrayList getFruits() {
		return (ArrayList) fruits.clone();
	}
}
