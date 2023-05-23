package Task10;

import static java.lang.System.out;


public class SmartPhone extends Phone {
	private double price, screenSize;
	//Smartphone app constructor
	SmartPhone(String brand, double price, double screenSize){
		super(brand);
		this.price=price;
		this.screenSize=screenSize;
	}
	//DisplayInfo function reports information from the list
	public void displayInfo() {
		out.printf("Phone brand  %s\n", getBrand());
		out.printf("Price tag    %s\n", price);
		out.printf("Screen size  %s\n", screenSize);
	}
	//Public getters and setters
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(double screenSize) {
		this.screenSize = screenSize;
	}
	
	
}
