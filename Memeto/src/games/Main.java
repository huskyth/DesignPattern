package games;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

import org.omg.CORBA.PUBLIC_MEMBER;

import games.Gamer;
import games.Memento;

public class Main {
	public static final String SAVEFILENAME = "E:\\Eclipse\\workspace\\Memeto\\game.dat";
	public static void main(String[] args) throws InterruptedException {

		Gamer gamer = new Gamer(100);
//		Memento memento = gamer.createMemento();
		Memento memento = loadMemto();
		
		
		if(memento != null) {
			System.out.println("��ȡ�ϴα���浵��ʼ��Ϸ");
			gamer.restoreMento(memento);
		}else {
			System.out.println("��ȡ�ϴα���浵��ʼ��Ϸ");
			memento = gamer.createMemento();
		}
		for (int i = 0; i < 100; i++) {
			System.out.println("====" + i);
			System.out.println("��ǰ״̬" + gamer);
			gamer.bet();
			System.out.println("���ֽ�ǮΪ" + gamer.getMoney() + 
					"Ԫ��");
			if(gamer.getMoney() > memento.money) {
				System.out.println("���ֽ�Ǯ���������,��˱��浱ǰ��Ϸ״̬" );
				memento = gamer.createMemento();
				saveMento(memento);
			}else if(gamer.getMoney() > memento.money / 2) {
				System.out.println("���ֽ�Ǯ���������,��˻ָ�����ǰ��Ϸ״̬" );
				gamer.restoreMento(memento);
			}
			
			Thread.sleep(1000);
			System.out.println("");
		}
	}
	
	
	public static void saveMento(Memento memento) {
		try {
			ObjectOutput output = new ObjectOutputStream(new FileOutputStream(SAVEFILENAME));
			output.writeObject(memento);
			output.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static Memento loadMemto() {
		Memento memento = null;
		ObjectInput in;
		try {
			in = new ObjectInputStream(new FileInputStream(SAVEFILENAME));
			memento = (Memento) in.readObject();
			in.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return memento;

	}
	
	
	
	
}
