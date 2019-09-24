package v39;

import java.util.Scanner;

public class stuckintime {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);	//intalizes the scanner	
		System.out.println("Gimme you Magic Number");
		int magicnumber = input.nextInt(); //scans the line and puts it in varble magic number
		
		for(int i = 0; i<=magicnumber; i++) { //for loop that will do it so many times magicnumber is equal to
			System.out.println(i+ " Abracadabra");
		}
		
	}
	

}
