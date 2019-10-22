package monday;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class metoder {
	public static void main(String[] args) throws InterruptedException {
		Scanner input = new Scanner(System.in);
		
		switch(input.nextLine()) {
		   case "cool" :
			   System.out.println("inte anders");
		      break; 
		   
		   case "anders" :
			   anders();
		      break;
		    
		   case "skola" :
			   skola();
			   break;
		
		}
		
		input.close();
	}
	
	public static void anders() throws InterruptedException{
		//System.out.println("anders");
		//TimeUnit.SECONDS.sleep(1);
		int d = 1; 
		d += 1;
		anders();
	}
	
	public static void skola() {
		Scanner input = new Scanner(System.in);
		
		int tal1;
		int tal2;
		
		System.out.println("Vänligen skriv in två heltal");
		tal1 = input.nextInt();
		tal2 = input.nextInt();
		
		if(tal1 <= tal2) {
			System.out.println(tal1);
		}
		else {
			System.out.println(tal2);
		}
		input.close();
	}
}
