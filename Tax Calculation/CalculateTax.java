package Q1;

import java.util.Scanner;

class Tax {
	double income;
	String gender;
	double tax = 0;
	int year;

	public void getTax() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the income:");
		income = s.nextDouble();
		System.out.println("Enter Gender:(male/female)");
		gender = s.next();
		System.out.println("Enter Year:");
		year = s.nextInt();

		if ((year == 2011 || year == 2012) && gender.equalsIgnoreCase("female")) {
			{
				if (income > 0 && income <= 190000) {
					System.out.println("No Tax");
				} else if (income > 190001 && income <= 500000) {
					tax = 0.1 * income;
					System.out.println("Tax:" + tax);
				} else if (income > 500001 && income <= 800000) {
					tax = 0.2 * income;
					System.out.println("Tax:" + tax);
				} else {
					tax = 0.3 * income;
					System.out.println("Tax:" + tax);
				}
			}
		} else {
			if (income > 0 && income <= 180000) {
				System.out.println("No Tax");
			} else if (income > 180001 && income <= 500000) {
				tax = 0.1 * income;
				System.out.println("Tax:" + tax);
			} else if (income > 500001 && income <= 800000) {
				tax = 0.2 * income;
				System.out.println("Tax:" + tax);
			} else {
				tax = 0.3 * income;
				System.out.println("Tax:" + tax);
			}
		}

		System.out.println("Your Income is" + income);
		System.out.println("Your tax is" + tax);
	}

}

public class CalculateTax {

	public static void main(String[] args) {
		Tax t = new Tax();
		t.getTax();
	}

}
