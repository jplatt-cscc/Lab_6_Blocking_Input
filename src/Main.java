import java.util.Scanner;
import java.util.Random;

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


        /*
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
        */


        /*
        double length = 0;
        double width = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        boolean badInput = true;

        do {
            badInput = true;
            Scanner in = new Scanner(System.in);
            System.out.println("What is the length of the rectangle? ");
            if (in.hasNextDouble()) {
                length = in.nextDouble();
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
            System.out.println("What is the width of the rectangle? ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                badInput = false;
            }
            else {
                System.out.println("That is an invalid input, try again...");
            }
        } while(badInput);

        area = length * width;
        perimeter = (length * 2) + (width * 2);
        diagonal = (length * length) + (width * width);
        diagonal = Math.sqrt(diagonal);

        System.out.println("The area of your rectangle is: " + area);
        System.out.println("The perimeter of your rectangle is: " + perimeter);
        System.out.println("The diagonal of your rectangle is: " + diagonal);
        */


        int randNum = 0;
        int guessNum = 0;
        boolean badInput = true;

        Random gen = new Random();
        randNum = gen.nextInt(10) + 1;

        do {
            badInput = true;
            Scanner in = new Scanner(System.in);
            System.out.println("What is your guess for the random number (1 - 10)? ");
            if (in.hasNextInt()) {
                guessNum = in.nextInt();
                in.nextLine();
                if (guessNum > 0 && guessNum < 11) {
                    badInput = false;
                }
                else {
                    System.out.println("That is an invalid input, try again...");
                }
            }
            else {
                System.out.println("That is an invalid input, try again...");
            }
        } while(badInput);

        if (guessNum < randNum) {
            System.out.println("Your guess of " + guessNum + " was lower than the random number of " + randNum);
        }
        else if (guessNum > randNum) {
            System.out.println("Your guess of " + guessNum + " was higher than the random number of " + randNum);
        }
        else {
            System.out.println("Your guess of " + guessNum + " was exactly the random number of " + randNum);
        }
    }
}