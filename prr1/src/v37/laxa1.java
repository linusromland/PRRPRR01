package v37;

import java.util.Scanner;

public class laxa1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your name?"); //writes out and asks about your name
		String name = input.nextLine(); //scans line and gives it the varible name
		
		System.out.println("Whats is your age?");
		String age = input.nextLine();
		
		System.out.println("Whats is your adress?");
		String adress = input.nextLine();
		
		System.out.println("Whats is your postal code?");
		String postcode = input.nextLine();
		
		System.out.println("In what city do you live in??");
		String city = input.nextLine();
		
		System.out.println("Whats is your phone number?");
		String number = input.nextLine();
		
	}

}
