package hej;

import java.util.Scanner;

public class method {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("This is the MethodLibrary assignment!");
        System.out.println("Type one of the following to start that method");
        System.out.println("tokelvin, tocelsius, velocity, kinetic, potenial, delta, small,");
        System.out.println("svtTime, work, velocityToHeight, sphereVolumeToRadius,sphereVolumeToRadius, itproblem, areaofcircle" );


        switch (input.nextLine()){
            case "tokelvin":
                System.out.println("Enter how many Fahrenheit!");
                double fahrenheit = input.nextDouble();
                System.out.println("Kelvin temperature is " + tokelvin(fahrenheit));
                break;
            case "tocelsius":
                System.out.println("Enter how many Kelvin");
                double kelvin = input.nextDouble();
                System.out.println("Celsius temperature is " + tokelvin(kelvin));
                break;
            case "velocity":
                System.out.println("Enter how many km/h");
                double velocity = input.nextDouble();
                System.out.println( velocityConversion(velocity) + "m/s");
                break;
            case "kinetic":
                System.out.println("Enter how much mass");
                double mass = input.nextDouble();
                System.out.println("Enter how much velocity");
                double velocity2 = input.nextDouble();
                System.out.println( kineticEnergy(mass, velocity2));
                break;
            case "potenial":
                System.out.println("Enter how much mass");
                double mass1 = input.nextDouble();
                System.out.println("Enter height");
                double height = input.nextDouble();
                System.out.println( kineticEnergy(mass1, height));
                break;
            case "delta":
                System.out.println("Enter your numbers");
                double first = input.nextDouble();
                double second = input.nextDouble();
                double last = input.nextDouble();
                System.out.println(delta(first,second,last));
                break;
            case "small":
                System.out.println(smallLetters("PaParaZZi"));
                break;
            case "svtTime":
                System.out.println("Enter your distance and velocity");
                double distance = input.nextDouble();
                double velocity4 = input.nextDouble();
                System.out.println(svtTime(distance, velocity4));
                break;
            case "work":
                System.out.println("Enter your force and distance");
                double force = input.nextDouble();
                double distance2 = input.nextDouble();
                System.out.println(work(force, distance2));
                break;
            case "velocityToHeight":
                System.out.println("Enter your velocity");
                double velocity3 = input.nextDouble();
                System.out.println(velocityToHeight(velocity3));
            case "sphereVolumeToRadius":
                System.out.println("Enter your volume");
                double volume = input.nextDouble();
                System.out.println(sphereVolumeToRadius(volume));
                break;
            case "itproblem":
                System.out.println("It Problem?");
                String answer = input.nextLine();
                System.out.println(itproblem(answer));
                break;
            case "areaofcircle":
                System.out.println("Enter your radius");
                double radius = input.nextDouble();
                System.out.println(areaOfCircle(radius));
                break;
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

    /**
     *  räknar ut medelvärde
     * @param first
     * @param second
     * @param last
     * @return
     */
    public static double delta(double first, double second, double last) {
    return(first+second+last/3);
    }

    /**
     * gör input till stora bokstäver
     * @param input
     * @return
     */

    public static String smallLetters(String input){
        return input.toLowerCase();
    }

    /**
     * byter ut o till 0 å gör allt i stora bokstäver
     * @param input2
     * @return
     */

    public static String bigletters(String input2){
        return input2.replace('o', '0').toUpperCase();
    }

    /**
     * Räknar ut SVT
     * @param distance
     * @param velocity
     * @return
     */

    public static double svtTime(double distance, double velocity) {
        return (distance / velocity);
    }

    /**
     * räknar ut work
     * @param force
     * @param distance
     * @return
     */

    public static double work(double force, double distance) {
        return (force * distance);
    }

    /**
     * velocity till height
     * @param velocity
     * @return
     */

    public static double velocityToHeight(double velocity) {
        return velocity /2;
    }

    /**
     * volym av kvadrat
     * @param Volume
     * @return
     */

    public static double sphereVolumeToRadius(double Volume) {
        return (Math.pow((Volume / ((4.0 / 3.0) * Math.PI)), (1.0 /3.0)));
    }

    /**
     * IT Problem?
     * @param answer
     * @return
     */

    public static String itproblem(String answer){
        if(answer.equals("IT Problem?")){
            return "Västkust IT";
        }
        else{
            return "die";
        }
    }

    /**
     * area av cirkel
     * @param radius
     * @return
     */

    public static double areaOfCircle(double radius) {
        return (Math.PI * Math.pow(radius, 2));
    }
}
