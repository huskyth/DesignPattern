package games;
import java.awt.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class Gamer {
	private int money;
	private ArrayList fruits = new ArrayList();
	private Random random = new Random();
	private static String[] fruitsname = new String[] {
		"ƻ��","����","�㽶","����"
	};
	public Gamer(int money) {
		// TODO Auto-generated constructor stub
		this.money = money;
	}
	public int getMoney(){
		return money;
	}

	public void bet() {
		int dice = random.nextInt(6) + 1;
		if(dice == 1) {
			money += 100;
			System.out.println("���ֽ�Ǯ������");
		}else if (dice == 2) {
			money /= 2;
			System.out.println("���ֽ�Ǯ������");
		} else if(dice == 6) {
			String dStrin = getFruit();
			System.out.println("�����ˮ��"+"("+dStrin+")��" );
			fruits.add(dStrin);
		}else {
			System.out.println("ʲô��û�з���");
		}
	}
	
	public Memento createMemento() {
		Memento memento = new Memento(money);
		Iterator iterator = fruits.iterator();
		while (iterator.hasNext()) {
			String fr = (String) iterator.next();
			if(fr.startsWith("�óԵ�")) {
				memento.addFruit(fr);
			}	
		}
		return memento;
	}
	
	public void restoreMento(Memento memento) {
		this.money  = memento.money;
		this.fruits = memento.getFruits();
		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[money:" + money +" fruits:" + fruits +"]";
		
	}
	
	private String getFruit() {
		String prefix  = "";
		if(random.nextBoolean()) {
			prefix = "�óԵ�";
		}
		return prefix + fruitsname[random.nextInt(fruitsname.length)];
	}
	
	
	
}
