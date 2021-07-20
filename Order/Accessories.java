package material;

import stock.Inventory;

public class Accessories extends Inventory {
	int proID;
	static String proName;
	static int price;

	public Accessories() {
		this.proID = 1;
		this.proName = "charger";
		quantity++;
		lowOrderLevelQuantity = 5;
		this.price = 1000;
	}

	public static void main(String[] args) {

	}
}
