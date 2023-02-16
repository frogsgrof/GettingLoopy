import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        // PART A


        // A loop that counts (i.e. displays the count) up by 1 from 0 to 30
        for (int i = 0; i <= 30; i++) {
            System.out.println(i);
        }


        // A loop that counts down by 1 from 30 to 0
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
        }


        // A loop that counts up by 3 from 0 to 18
        for (int i = 0; i <= 18; i += 3) {
            System.out.println(i);
        }


        // A loop that counts down by 2 from 10 to 0
        for (int i = 10; i >= 0; i -= 2) {
            System.out.println(i);
        }



        // PART B


        // 1.)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2.)
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 3.)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




        // C to F

        // "new main file" starts here (I don't think we can do that in intellij)

        // freezing and boiling point constants
        final double FREEZING_CELSIUS = 0;
        final double BOILING_CELSIUS = 100;
        final double FREEZING_FAHRENHEIT = 32;
        final double BOILING_FAHRENHEIT = 212;

        double inputCelsius = 0.0; // stores user input
        boolean inputValid; // ends loop
        String trash; // bad input

        Scanner in = new Scanner(System.in);

        double fahrenheit; // stores temp in F after conversion

        // input loop
        do {

            inputValid = false; // reset to false

            // prompt
            System.out.println("Enter a temperature in degrees Celsius to convert it to Fahrenheit:");

            // check
            if (in.hasNextDouble()) { // store input if valid
                inputCelsius = in.nextDouble();
                in.nextLine(); // clear next line
                inputValid = true;
            } else {
                trash = in.nextLine();
                System.out.println("ERROR: '" + trash + "' could not be understood. Please try again.");
            }

        } while (!inputValid); // keeps running when input is invalid

        // calculate
        fahrenheit = ((inputCelsius * 9) / 5) + 32;

        // output -- I wanted it to round to the tenth
        System.out.printf("%.1f degrees Celsius is equal to ", inputCelsius);
        System.out.printf("%.1f degrees Fahrenheit.%n", fahrenheit);

        // check boiling/freezing points
        if (inputCelsius <= FREEZING_CELSIUS) {
            System.out.println("This temperature is below the freezing point of " + FREEZING_CELSIUS +
                    " degrees Celsius or " + FREEZING_FAHRENHEIT + " degrees Fahrenheit.");
        } else if (inputCelsius >= BOILING_CELSIUS) {
            System.out.println("This temperature is over the boiling point of " + BOILING_CELSIUS +
                    " degrees Celsius or " + BOILING_FAHRENHEIT + " degrees Fahrenheit.");
        }

        // end C to F





        // EXTRA CREDIT

        // I managed to squeeze it into a single loop
        for (int i = 0; i < 6; i++) {
            System.out.println("**     **");

            if (i == 2) {
                System.out.println("*********");
            }
        }


        // end
    }
}