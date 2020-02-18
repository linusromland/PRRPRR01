package talspelet;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class talspelet {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        while(true) { //this is here so i can restart the game.

            System.out.println("Welcome to the Number Game!");
            System.out.println("A very orginal game idea from offlinus");
            System.out.println("Do you want to play (1) or exit (0). Press enter after."); // a case switch to choose if you want to play or exit the game

            switch (input.nextLine()) {
                case "1":
                    run();
                    break;

                case "0":
                    System.out.println("Thank You for playing!");
                    System.out.println("A gane by offlinus! https://www.romland.space/");
                    TimeUnit.SECONDS.sleep(1);
                    return;

            }
        }

    }


    /**
     * calls the other methods and runs the game
     * also here you choose difficulty and interval
     */
    public static void run(){
        Scanner input = new Scanner(System.in);
        System.out.println("What interval do you want the number to be in? choose 0 for random");
        int answer;
        try{ // checks so the input is an int
            answer = input.nextInt();
        }catch (Exception e){
            System.out.println("Thats not an int as i were expecting!");
            return;
        }
        int number = interval(answer); //calls the method and generates the number
        int tries = 1;

        System.out.println("What difficulty do you want?");
        System.out.println("Easy is unlimited tries");
        System.out.println("Medium is 20 tries");
        System.out.println("Hard is 10 tries");

        String diffcultyans;

        try {
            diffcultyans = input.next();
        }catch (Exception s){
            System.out.println("I wanted a string as the input!");
            input.next();
            return;
        }
        int difficulty = difficulty(diffcultyans); //checks what difficulty is selected and then makes it an int with the right amount of allowed of tries
        int guess1;
        do {
            guess1 = guess(tries, difficulty, number);
            tries++;
        }while(number != guess1);

    }

    /**
     * selects the answer by taking the selected interval and selecting randomly
     * @param answer
     * @return
     */
    public static int interval(int answer) {
        int interval;
        if (answer == 0){ //randomly generates the answer
             interval = new Random().nextInt(99999);        }
        else {
            interval = new Random().nextInt(answer);
        }
        return interval;
    }

    /**
     * chooses the difficulty and returns the allowed amount of tries!
     * @param answer
     * @return
     */
    public static int difficulty(String answer){
        int retur = 0;
        if (answer.equals("easy") || answer.equals("Easy")){  //if the answer is easy then it puts in unlimted tries
            retur = 999999;
        }
        else if (answer.equals("medium") || answer.equals("Medium")){
            retur = 20;
        }
        else if (answer.equals("hard") || answer.equals("Hard")){
            retur = 10;
        }
        else {
            System.out.println("Select what difficulty you want!");
        }
        return retur;
    }

    /**
     * checks the guess to see if it is bigger smaller or the correct answer
     * @param tries
     * @param diff
     * @param number
     * @return
     */
    public static int guess (int tries, int diff, int number){
        Scanner input = new Scanner(System.in);
        int guess = 0;
        if(tries > diff){ //checks if you have any tries left
            System.out.println("Oh no! Your tries are up! You dead now. Haha!");
        }
        else{ //asks what your guess is
            System.out.println("What is your " + tries + " guess?");
            try{ //checks so the answer is a int
                guess = input.nextInt();
            }catch (Exception j){
                System.out.println("I wanted a int. Not anything else!!");
            }
            if (guess < number){ //checks if it is smaller or larger or the answer
                System.out.println("The Number is bigger than that");
            }
            else if (guess > number){
                System.out.println("The Number is smaller than that");

            }
            else if (guess == number){
                System.out.println("Congrats!");
            }
        }
        return guess;

    }
}
