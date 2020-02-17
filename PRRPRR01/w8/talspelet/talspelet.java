package talspelet;
import java.util.*;

public class talspelet {
    public static void main(String[] args) {
        System.out.println("tjo");
        run();
    }
    public static int run(){
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Number Game!");
        System.out.println("A very orginal game idea from offlinus");

        System.out.println("What interval do you want the number to be in? choose 0 for random");
        int answer = input.nextInt();
        int interval = interval(answer);

        System.out.println("What difficulty do you want?");
        System.out.println("Easy is unlimited tries");
        System.out.println("Medium is 20 tries");
        System.out.println("Hard is 10 tries");

        String answerdiff = input.nextLine();
        int difficulty = difficulty(answerdiff);
    }
    public static int interval(int answer) {
        if (answer == 0){
             return new Random().nextInt(99999);        }
        else {
            return new Random().nextInt(answer);
        }
    }
    public static int difficulty(String answer){
        if (answer.equals("easy") && answer.equals("Easy")){
            return 999999;
        }
        else if (answer.equals("medium") && answer.equals("Medium")){
            return 20;
        }
        else if (answer.equals("hard") && answer.equals("Hard")){
            return 10;
        }
        else {
            System.out.println("Answer the difficulty idiot");
        }
    }
}
