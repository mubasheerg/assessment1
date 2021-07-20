package Q2;

import java.util.Scanner;

public class Egg {
	public static void main(String[] asd) {
		Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the number of eggs");
		int n = sc.nextInt();
		System.out.println("Your number of eggs is ");
		int g = n / 144;
		System.out.print(g + " gross, ");
		int r = n - (g * 144);
		int d = r / 12;
		System.out.print(d + " dozen, ");
		r = r - d * 12;
		System.out.print(" and " + r + " remaining");
	}
}