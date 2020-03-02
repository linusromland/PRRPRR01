package v38;

import java.util.Scanner;

public class monday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ålder tack");
		Scanner input = new Scanner(System.in);
		int dino = input.nextInt();

		if (dino >= 18) {
			System.out.println("Fan va trevligt!");
		} else if (dino > 14) {
			System.out.println("Fan va coolt!");
		} else {
			System.out.println("fan va liten du e");
		}

	}
}
