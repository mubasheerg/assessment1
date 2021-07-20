package stock;

import material.Accessories;
import material.Laptops;

public class Order {

	public static void main(String[] arg) {
		// creating objects
		Laptops[] obj = new Laptops[5];
		for (int i = 1; i <= 5; i++) {
			obj[i] = new Laptops(i);
		}
		Accessories[] obj2 = new Accessories[10];
		for (int i = 1; i <= 10; i++) {
			obj2[i] = new Accessories();
		}
		// user requirement
		char q = 'y';// y for yes, n for no
		do {
			System.out.println("");

		} while (q != 'n');
	}
}