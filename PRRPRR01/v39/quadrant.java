package v39;

import java.util.Scanner;

public class quadrant {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); //intializes the scanner
		System.out.println("gimme cordinates plz");	
		
		int x = input.nextInt();	//scans the line and puts the answer in varible x
		int y = input.nextInt();	//scans the line and puts the answer in varible y

		if(x>0&&y>0)System.out.println(1);		//if else to check in what quadrant it will be in
		else if(x<0&&y>0)System.out.println(2);
		else if(x<0&&y<0)System.out.println(3);
		else if(x>0&&y<0)System.out.println(4);

	}

}
