package v40;

import java.time.LocalTime;
import java.util.Scanner;

public class spavanac3 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in); // initalizes the scanner

		System.out.println("What will be your hour?");
		int hour = input.nextInt(); // puts answer in varible
		if (hour < 24) { // if else to test that the hour input is correct. aka a valid time

			System.out.println("What will be your minutes?");
			int minutes = input.nextInt();

			if (minutes < 59) { // if else to test that the minutes input is correct. aka a valid time
				LocalTime time = LocalTime.of(hour, minutes); // puts the answer in a LocalTime varible

				System.out.println("Your time minus 45 minutes is...");
				System.out.println(time.minusMinutes(45)); // prints the answer

			} else {
				System.out.println("Enter a valid time!");
			}
		} else {
			System.out.println("Enter a valid time!");
		}
		input.close();
	}

}
