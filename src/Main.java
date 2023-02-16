public class Main {
    public static void main(String[] args) {

        /*

Part B: Output for loops (2 points each)
Use nested for loops to do these. Again, paste the output copy or screen shot after each one.

(6 Points)
Redo either the F to C or C to F converter program.
Create a new Java Main File called CtoF.java or FtoC.java.  (Don’t create a new project,
just put it in the current project with the previous java main class.)


Use a do while loop to bulletproof the user input.  Now, when the user fails to enter
a valid number, the program will display an error msg and then loop and prompt them again
to try again to input the value correctly.  So, the program will block and repeat until
they get it right. Be sure to thoroughly test your program.  Include screen shots output c
opies here that show the tests and output.
*/
        /*

Extra Credit or Graduate Option: (2 points)

Just add this code to the end of your main method.

Write a program that outputs an elaborate capital version of your first initial using * characters.  (
Note if your first initial is I use your last initial.) Use loops to print out duplicate lines in the character.
Again no blank lines. Here the first loop would do the first 3 lines and a second would do the rest.
         */


        // PART A


        // A loop that counts (i.e. displays the count) up by 1 from 0 to 30
        for (int i = 0; i <= 30; i++) {
//            System.out.println(i);
        }


        // A loop that counts down by 1 from 30 to 0
        for (int i = 30; i >= 0; i--) {
//            System.out.println(i);
        }


        // A loop that counts up by 3 from 0 to 18
        for (int i = 0; i <= 18; i += 3) {
//            System.out.println(i);
        }


        // A loop that counts down by 2 from 10 to 0
        for (int i = 10; i >= 0; i -= 2) {
//            System.out.println(i);
        }



        // PART B


        // 1.)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
//                System.out.print("*");
            }
//            System.out.println();
        }

        // 2.)
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
//                System.out.print("*");
            }
//            System.out.println();
        }

        // 3.)
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }




        // end
    }
}