package v39;

import java.util.Scanner;

public class r2 {
		public static void main(String[] args) {
			
			Scanner input = new Scanner(System.in); //initalizes the scanner
			
			System.out.println("IN:");
			System.out.println("ONLY INT AS INPUT NOTHING ELSE IT WILL DIE");
			int r1 = input.nextInt(); //scans the line and puts the answer in varible r1
			int s = input.nextInt();	//scans the line and puts the answer in varible s
			
			int r2 = 2*s -r1; 		//does the math to see what r2 will be
			System.out.println("OUT:");	//prints the answer
			System.out.print(r2);
		}
			
		
}
