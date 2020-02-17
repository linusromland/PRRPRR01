package v40;

import java.util.concurrent.TimeUnit;

public class lektion1 {
	public static void main(String[] args) throws InterruptedException {
			
			// % == modulus
		
		int nr1 = 48;
		int nr2 = 19;
		int nr3 = 69;
		int nr4 = -137;
		
		System.out.println(nr1%3);   // tests to see if number 3 i devidable with 3
									// if it is answer = 0 if else the modulus will be printed
		int sum = 0;

		for (int i = 0; i < 101 ;i++) {
			
			
			if(i % 3 == 0) {
				System.out.println("The number " + i +" is devidable with 3");
				
				sum += i;
			}
		}
		System.out.println("The total sum of all integers divadble with 3 is " + sum);
		
		int turn = 0;
		
		while (true) {
			
			turn++;
			
			if(turn%3 == 0) {
				System.out.println("Davids TURNNNN!");
		       TimeUnit.SECONDS.sleep(1); //sleeps
			}
			else if(turn%3 == 1) {
				System.out.println("Johans TURN!");
		        TimeUnit.SECONDS.sleep(1); //sleeps

			}

				System.out.println("Lucas TURN!!!!");
		        TimeUnit.SECONDS.sleep(1); //sleeps
				if (turn == 100) {
					break;
			}

			
		}
	}
}

