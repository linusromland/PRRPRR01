package v39;

import java.util.Scanner;

public class quadrant {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("gimme cordinates plz");
		
		int x = input.nextInt();
		int y = input.nextInt();

		if(x>0&&y>0)System.out.println(1);
		else if(x<0&&y>0)System.out.println(2);
		else if(x<0&&y<0)System.out.println(3);
		else if(x>0&&y<0)System.out.println(4);

	}

}
