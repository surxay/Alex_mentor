package beans;

import java.util.ArrayList;
import java.util.List;

public class Coffee extends Drink {

	private String flawour;
	private static List<String> options;
	
	static {
		options = new ArrayList<>();
	    options.add("FRESHLY BREWED COFFEE");
	    options.add("ICED COFFEE");
	    options.add("CAFFE AMERICANO");
	    options.add("FLAT WHITE");
	    options.add("CAFFE LATTE");
	    options.add("CARAMEL MACCHIATO");
	    options.add("WHITE CHOCOLATE MOCHA");
	    options.add("CAFFE MOCHA");
	}
	
	public void setName (String name) {
		if (options.contains(name.toUpperCase())) {
			super.setName(name);
		}else {
			System.out.println("CoffeeNameNotFoundException : "+ name);
		}
	}
	
	 //constructor
	public Coffee(String name, String size, int cal, double price) {
		super(name, size, cal, price);
	}

	public String toString() {
		return "Coffee [name=" + getName() + ", size=" + getSize() + ", cal=" + getCal() + ", price=" + getPrice() + "]\n";
	}
	
}
