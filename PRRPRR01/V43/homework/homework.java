package homework;

import java.util.Scanner;

public class homework {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("What program do you want to run? Just type the name and then enter to start");
		System.out.println("Program lol is just a program that prints HAHAHAH");
		System.out.println("Program smallestnumber just prints the smallest number");
		System.out.println("Program numbers prints all numbers between 1 and the number you enter");
		System.out.println("Program celsiustokelvin converts celsius to kelvin");
		System.out.println("Program fahrenheittocelsius converts fahrenheit to celsius");
		System.out.println("program agecontrol says what you can do ish");
		
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
			case "numbers":
				numbers();
			case "celsiustokelvin":
				System.out.println(celsiustokelvin() + " kelvin");
			case "fahrenheittocelsius":
				System.out.println(fahrenheittocelsius() + " celsius");
			case "agecontrol()":
				agecontrol();
				
		}
	}
	
	public static void lol() {
		System.out.println("HAHAHAHAHAH");
	}
		public static void smallestnumber(int a, int b) {
			
			if (a <= b) {
				System.out.println("Smalles number is: " + a);
			} else {
				System.out.println("Smalles number is: " + b);
			}
			
	}
		public static void numbers(){
			Scanner input = new Scanner(System.in);
			System.out.println("How long do you want to count?");
			int number;
			number = input.nextInt();
			for(int i = 1; i<= number; i++) {
				System.out.println(i);
				input.close();
			}
		}
		public static double celsiustokelvin() {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter how many celsius!");
			double c = input.nextDouble();
			double kelvin = c -= 273.15;
			return kelvin;
		}
		public static double fahrenheittocelsius() {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter how many fahrenheit!");
			double f = input.nextDouble();
			double c = f -= 40;
			return c;
		}
		public static void agecontrol() {
			Scanner input = new Scanner(System.in);
			System.out.println("How old are you?");
			int age = input.nextInt();
			if(age < 0) {
				System.out.println("not even born yet!");
			}
			else if(age > 5) {
				System.out.println("Little kids cant do anything");
			}
			else if(age < 12) {
				System.out.println("You can play Fortnite! Not that you want to do that ");
			}
			else if(age < 14) {
				System.out.println("You are an teenager");
			}
			else if(age <17) {
				System.out.println("You can drive a moped");
			}
			else if(age < 20){
				System.out.println("You can drive a car");
			}
			else if (age < 64) {
				System.out.println("You get a grownups sentence if you do something bad");
			}
			else if(age < 99) {
				System.out.println("You are retierd");
			}
			else {
				System.out.println("R.I.P?");
			}
		}
}
