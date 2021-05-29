package idcard;

import java.awt.List;
import java.security.KeyStore.PrivateKeyEntry;
import java.util.ArrayList;
import java.util.HashMap;

import javax.sql.rowset.serial.SerialArray;

import org.omg.CORBA.PRIVATE_MEMBER;

import framework.Factory;
import framework.Product;

public class IDCardFactory extends Factory{
	private HashMap<Integer, String> database= new HashMap<>(); 
	private int SerialArray = 100;
	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner,SerialArray ++ );
	}

	@Override
	protected void registerProduct(Product owner) {
		IDCard idCard = (IDCard)owner;
		database.put(idCard.getSerial(),idCard.getOwner());
	}
	
	public HashMap<Integer, String> getDatabase() {
		return database;
	}

}
