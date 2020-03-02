package v38;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class laca2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in); // makes the scanner possible to use
		System.out.println("Ge mig tal nr 1"); //Asks you enter the first number
		Double svar1 = input.nextDouble();	   //Scans the line and puts the answer in varible
		System.out.println("Ge mig tal nr 2");
		Double svar2 = input.nextDouble();
		System.out.println("Ge mig tal nr 3");
		Double svar3 = input.nextDouble();
		System.out.println("Ge mig tal nr 4");
		Double svar4 = input.nextDouble();
		System.out.println("Ge mig tal nr 5");
		Double svar5 = input.nextDouble();
		Double largest = null;

		if (svar1 > svar2 && svar1 > svar3 && svar1 > svar4 && svar1 > svar5) { //checks to see the largest number using if else
			System.out.println(svar1 + " är största talet!");
		} else if (svar2 > svar1 && svar2 > svar3 && svar2 > svar4 && svar2 > svar5) {
			System.out.println(svar2 + " är största talet!");
		} else if (svar3 > svar1 && svar3 > svar2 && svar3 > svar4 && svar3 > svar5) {
			System.out.println(svar3 + " är största talet!");
		} else if (svar4 > svar1 && svar4 > svar3 && svar4 > svar2 && svar4 > svar5) {
			System.out.println(svar4 + " är största talet!");
		} else {
			System.out.println(svar5 + " är största talet!");
		}
        TimeUnit.SECONDS.sleep(1); // sleeps for 1 seconds before showing the second answer


		if (svar5 > svar1 && svar4 > svar1 && svar3 > svar1 && svar2 > svar1) { //checks to see the smallest nunmber using if else
			System.out.println(svar1 + " är minsta talet!");
		} else if (svar5 > svar2 && svar4 > svar2 && svar3 > svar2 && svar1 > svar2) {
			System.out.println(svar2 + " är minsta talet!");
		} else if (svar5 > svar3 && svar4 > svar3 && svar2 > svar3 && svar1 > svar3) {
			System.out.println(svar3 + " är minsta talet!");
		} else if (svar5 > svar4 && svar3 > svar4 && svar2 > svar4 && svar1 > svar4) {
			System.out.println(svar4 + " är minsta talet!");
		} else {
			System.out.println(svar5 + " är minsta talet!");
		}
        TimeUnit.SECONDS.sleep(1); //sleeps

		Double middlevarde = svar1+svar2+svar3+svar4+svar5; //calculates the average and later prints the answer
		Double middlevardesvar = middlevarde/5;
		System.out.println(middlevardesvar+" är medelvärdet!");
        TimeUnit.SECONDS.sleep(5);						//sleeps
		System.out.println("IT Problem?");  			//some advertisment for Västkust IT!!!
		System.out.println("Västkust IT hjälper dig");
		System.out.println("www.vastkustit.se");
		System.out.println("kontakt@vastkustit.se");
	}

}
