package linusromland;

import java.util.Scanner; 

public class vecka37 {

	public static void main(String[] args) {
		System.out.println("Vill du dö?");
		Scanner scan = new Scanner(System.in);
		String ans = scan.next();
		if (ans.equals("ja") || ans.equals("Ja")) {
			System.out.println("same");
		}
		if (ans.equals("nej") || ans.equals("Nej")) {
			System.out.println("Tror du ljuger lite där asså");
		}
		else {
			System.out.println("SVARA PÅ FRÅGANNNNNNN!");

		}
}
}