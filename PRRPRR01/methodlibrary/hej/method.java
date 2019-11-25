package hej;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is the MethodLibrary assignment!");
        switch (input.nextLine()){
            case "tokelvin":
                System.out.println("Enter how many Fahrenheit!");
                double fahrenheit = input.nextDouble();
                System.out.println("Kelvin temperature is " + tokelvin(fahrenheit));
            case "tocelsius":
                System.out.println("Enter how many Kelvin");
                double kelvin = input.nextDouble();
                System.out.println("Celsius temperature is " + tokelvin(kelvin));
            case "velocity":
                System.out.println("Enter how many km/h");
                double velocity = input.nextDouble();
                System.out.println( velocityConversion(velocity) + "m/s");
            case "kinetic":
                System.out.println("Enter how much mass");
                double mass = input.nextDouble();
                System.out.println("Enter how much velocity");
                double velocity2 = input.nextDouble();
                System.out.println( kineticEnergy(mass, velocity2));
            case "potenial":
                System.out.println("Enter how much mass");
                double mass1 = input.nextDouble();
                System.out.println("Enter height");
                double height = input.nextDouble();
                System.out.println( kineticEnergy(mass1, height));
            case "delta":
                System.out.println("Enter your numbers");
                double first = input.nextDouble();
                double second = input.nextDouble();
                double last = input.nextDouble();
                System.out.println(delta(first,second,last));
            case "small":
                System.out.println(smallLetters("PaParaZZi"));
        }

    }

    /**
     * omvandlar fahrenheit till kelvin
     * @param fahrenheit
     * @return
     */

    public static double tokelvin(double fahrenheit){
        return (fahrenheit-32)*5/9+273.15;
    }

    /**
     * omvandlar kelvin till celsius
     * @param kelvin
     * @return
     */

    public static double toCelsius(double kelvin){
        return kelvin + 273.15;
    }

    /**
     * omvandlar kmh till ms
     * @param velocity
     * @return
     */
    public static double velocityConversion(double velocity){
        return velocity *3.6;
    }

    /**
     * räknar ut kinetic Energy
     * @param mass
     * @param velocity2
     * @return
     */
    public static double kineticEnergy(double mass, double velocity2){
        return mass*Math.pow(velocity2 , 2)/2;
    }

    /**
     * räknar ut potenial energy
     * @param mass
     * @param height
     * @return
     */
    public static double potentialEnergy(double mass, double height){
        return mass*height*9.8;
    }

    public static double delta(double first, double second, double last) {
    return(first+second+last/3);
    }
    public static String smallLetters(String input){
        return input.toUpperCase();
    }
    public static String bigletters(String input2){
    }



}
