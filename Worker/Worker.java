package Q4;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Worker {
	String name;
	int salary = 1000;
	int workdays = 5;
	int workhours = 40;
	int salary_got;
	char type_worker;

	int pay(int no, int type) {

		if (type == 0) {
			if (no > 5)
				no = 5;
			int r = salary / workdays;
			return r * no;
		}
		if (no > 40)
			no = 40;
		int r = salary / workhours;
		return no * r;
	}

	public static void main(String[] asd) throws Exception {
		ArrayList<Worker> fn = new ArrayList<Worker>();
		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Enter Worker type:\n0-Daily wage\n1-Salarized\nother numbers to exit");
			int t;
			t = Integer.parseInt(sc.readLine());
			if (t == 0) {
				System.out.println("Enter name,No_of_days");// fixed maximum of 5 working days in a week
				Dailyworker a = new Dailyworker();
				String p = sc.readLine();
				a.name = p;
				a.no_of_days = Integer.parseInt(sc.readLine());
				Worker f1 = new Worker();
				f1.type_worker = 'D';
				f1.salary_got = a.pay(a.no_of_days, 0);
				f1.name = a.name;
				fn.add(f1);
			} else if (t == 1) {
				System.out.println("Enter name,no_of_hours");// fixed a maximum of 40 working hours in a week
				Salariedworker s = new Salariedworker();
				s.name = sc.readLine();
				s.no_of_hours = Integer.parseInt(sc.readLine());
				Worker f1 = new Worker();
				f1.type_worker = 'W';
				f1.salary_got = s.pay(s.no_of_hours, 0);
				f1.name = s.name;
				fn.add(f1);
			} else
				break;
		}
		fn.sort((a, b) -> a.salary_got - b.salary_got);
		for (Worker i : fn) {
			System.out.println(
					"Name : " + i.name + ",Salary got: " + i.salary_got + ",type of worker : " + i.type_worker);
		}
	}

}

class Dailyworker extends Worker {
	int no_of_days;
}

class Salariedworker extends Worker {
	int no_of_hours;
}
