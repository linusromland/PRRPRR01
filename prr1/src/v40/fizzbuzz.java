package v40;

import java.util.Scanner;

public class fizzbuzz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); //initalizes the scanner

		int input1 = input.nextInt();
		int input2 = input.nextInt();
		int input3 = input.nextInt();

		for (int i = 1; i <= input3; i++) {  //loop

			if (i % input1 == 0 && i % input2 == 0) { //checks if the number is deviadble with both input1 and input 2. iff so prints Fizzbuzz
				System.out.println("FizzBuzz");
			}
			else if (i % input1 == 0) { //checks if the number is deviadble with input1
				System.out.println("Fizz");
			}
			else if (i % input2 == 0) {
				System.out.println("Buzz");
			}
			else  { 
				System.out.println(i); //if its not devidable then prints the number instead
			}
		}
		input.close();
	}
}
