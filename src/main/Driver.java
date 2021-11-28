package main;
import java.util.Scanner;

import model.Employee;

public class Driver {
	
	public static void main(String a[]) {
		Scanner input = new Scanner(System.in);
		int opt;
		String department = "";
		do {
			
			System.out.println("Please choose the department from the following:");
			System.out.println("1. Technical");
			System.out.println("2. Admin");
			System.out.println("3. Human Resource");
			System.out.println("4. Legal");
			
			opt = input.nextInt();
			
			switch (opt) {
			case 1:
				department = "tech";
				break;
			case 2:
				department = "admin";
				break;
			case 3:
				department = "hr";
				break;
			case 4:
				department = "legal";
				break;
			default:
				System.out.println("Invalid Option");
			}
			
		} while(opt <1 && opt >4);
		
		System.out.println("Please enter first name: ");
		String firstName = input.next();
		System.out.println("Please enter last name: ");
		String lastName = input.next();
		
		Employee E1 = new Employee(firstName, lastName, department);
		
		input.close();
	}
}
