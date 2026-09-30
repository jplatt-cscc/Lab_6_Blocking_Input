import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
    }
}