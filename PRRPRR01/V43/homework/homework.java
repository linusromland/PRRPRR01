package homework;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What program do you want to run? Just type the name and then enter to start");
		System.out.println("Program lol is just a program that prints HAHAHAH");
		System.out.println("Program smallestnumber just prints the smallest number");
		System.out.println("Program numbers prints all numbers between 1 and the number you enter");
		switch(input.nextLine()){
			case "lol" :
				lol();
				break;
			case "smallestnumber":
				int a;
				int b;
				a = input.nextInt();
				b = input.nextInt();
				smallestnumber(a, b);
		}
	}
	
	public static void lol() {
		System.out.println("HAHAHAHAHAH");
	}
		public static String smallestnumber(int tal3, int tal4) {
			
			if (tal3 <= tal4) {
				System.out.println("Minsta talet är: " + tal3);
			} else {
				System.out.println("Minsta talet är: " + tal4);
			}

	}
}
