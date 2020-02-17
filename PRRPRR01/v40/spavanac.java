package v40;

import java.util.Scanner;

public class spavanac {
	
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("What will the time be? 24h Clock! (hh:mm)");
		String time = input.nextLine();
		time = time.replaceAll(":","");
		int clock = Integer.parseInt(time);

		if (clock > 2400) {
			System.out.println("Please enter a valid time!");
		}
		else if(clock < 45) {
			int specialcase = 45-clock;
			int specialtime = 2400-specialcase;
			int time3 = specialtime - 40;
			String time2 = Integer.toString(time3);
			time2 = time2.substring(0, 2) + ":" + time2.substring(2, time2.length());
			System.out.println(time2);

		}
		else if(clock < 2400 && clock > 45) {
			int answer = clock-45;
			int hours = Integer.parseInt( String.valueOf(answer).substring(0,2));
			int minutes = Integer.parseInt( String.valueOf(answer).substring(2,4));
			if(minutes > 15) {
				int correcttime = minutes - 40;
				System.out.println(hours + ":" + correcttime);

			}
		}
		input.close();
	}
}
