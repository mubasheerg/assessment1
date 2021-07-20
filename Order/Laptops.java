package material;

import stock.Inventory;

public class Laptops extends Inventory {
	private int proID;
	int lowOrderLevelQuantity = 3;
	int quantity = 0;
	static int price;

	public Laptops(int id) {
		quantity++;
		this.proID = id;
		this.price = 100000;
	}

}
