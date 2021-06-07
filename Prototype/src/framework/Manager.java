package framework;

import java.util.HashMap;

import javax.imageio.spi.RegisterableService;

public class Manager {
	private HashMap showcase = new HashMap<>();
	
	public void register(String name,Product prod){
		showcase.put(name, prod);
	}
	
	public Product create(String proname) {
		Product product =  (Product) showcase.get(proname);
		return product.createClone();
	}
}
