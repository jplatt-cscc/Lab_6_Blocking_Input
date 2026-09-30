import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        double cel = 0;
        double fahr = 0;
        boolean badInput = true;

        do {
            Scanner in = new Scanner(System.in);
            System.out.println("What is the temperature in Celsius? ");
            if (in.hasNextDouble()) {
                cel = in.nextDouble();
                in.nextLine();
                badInput = false;
            }
            else {
                System.out.println("That is an invalid input, try again...");
            }
        } while(badInput);

        fahr = (cel * 1.8) +32;
        System.out.println("Your temperature in fahrenheit is: " + fahr);
        */


        double tankSize = 0;
        double fuelEff = 0;
        double price = 0;
        boolean badInput = true;
        double cost = 0;
        double dist = 0;

        do {
            badInput = true;
            Scanner in = new Scanner(System.in);
            System.out.println("How many gallons of gas does your tank hold? ");
            if (in.hasNextDouble()) {
                tankSize = in.nextDouble();
                in.nextLine();
                badInput = false;
            }
            else {
                System.out.println("That is an invalid input, try again...");
            }
        } while(badInput);

        do {
            badInput = true;
            Scanner in = new Scanner(System.in);
            System.out.println("How many miles per gallon do you get? ");
            if (in.hasNextDouble()) {
                fuelEff = in.nextDouble();
                in.nextLine();
                badInput = false;
            }
            else {
                System.out.println("That is an invalid input, try again...");
            }
        } while(badInput);

        do {
            badInput = true;
            Scanner in = new Scanner(System.in);
            System.out.println("How much does a gallon of gas cost? ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                in.nextLine();
                badInput = false;
            }
            else {
                System.out.println("That is an invalid input, try again...");
            }
        } while(badInput);

        cost = (100 / fuelEff) * price;
        dist = fuelEff * tankSize;

        System.out.println("The cost to drive 100 miles is: " + cost);
        System.out.println("You can drive " + dist + " on a full tank.");
    }
}