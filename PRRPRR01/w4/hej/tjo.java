package hej;

import java.util.Arrays;
import java.util.Scanner;

public class tjo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("gimme number");
        int m = input.nextInt();
        int[] numbers = new int[m];
        boolean swapped;
        int temp;
        System.out.println("gimme somthing");
        int jkjkjk = input.nextInt();

        for (int i = 0; i < numbers.length; i++) { //slumpar 37 heltal mellan 0-1000
            numbers[i] = (int) (Math.random()*jkjkjk);
        }
        System.out.println(Arrays.toString(numbers));
        int cool = 0;
        do {
            cool++;

            swapped = false; // nollställer swapped i början på jämförelsen

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > numbers[i + 1]) { // byter plats på två intilliggande tal
                    temp = numbers[i]; // sparar tillfälligt värdet på vänstra sidan
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    swapped = true;
                    System.out.println(cool*100/m + "percentage");
                }

            }
        } while (swapped);

        System.out.println(Arrays.toString(numbers));
        america(cool);

    }
    public static void america(int coooool){
        System.out.println("many intervalls is " + coooool);
    }
}
