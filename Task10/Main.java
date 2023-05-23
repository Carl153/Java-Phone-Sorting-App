package Task10;

import static java.lang.System.out;
import java.io.IOException;


//Invokes the Phone class, Smartphone class and SmartPhoneApp class
public class Main {
	public static void main(String[] args) {
		String txtfile = "data/data2.txt";
		try {
			SmartPhoneApp app = new SmartPhoneApp(txtfile);
			SmartPhone cheapest = app.getCheapest();
			if(cheapest != null) {
				out.println("Cheapest phone:");
				cheapest.displayInfo();
			}
			out.printf("Phones with screen size 5-7 inches: %d\n", app.countPhones());
			app.randomPhoneList();
		}
		catch(IOException ioe) {
			out.printf("Perhaps missing text file: %s/%s? \n\n",
					new Main().getClass().getPackage().getName(), txtfile);
		}
	}


}
