package tuesday;

import java.util.Scanner;

public class metoder2 {
	public static void main(String[] args) {
		System.out.println("cool");
	}

	public static void twonumbers() {
		Scanner input = new Scanner(System.in);

		int tal1;
		int tal2;

		System.out.println("V�nligen skriv in tv� heltal");
		tal1 = input.nextInt();
		tal2 = input.nextInt();

		if (tal1 <= tal2) {
			System.out.println(tal1);
		} else {
			System.out.println(tal2);
		}

	}
}
