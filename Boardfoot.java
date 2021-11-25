/*
* This program calculates the length of a boad.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-11-23
*/

// Imports.
import java.util.Scanner;

/**
* This program calculates the length of a board.
* (remember to change the name after "final class").
*/
final class Boardfoot {

    /**
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private Boardfoot() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This function calculates the length from the inputs provided.
    *
    * @param height this is the hight of the wood.
    * @param width this is the width of the wood.
    * @return this function returns the length that the wood should be.
    */
    public static int lengthCalculator(final int height, final int width) {
        // Variables.
        final int oneBoardFoot = 144;

        final int length = oneBoardFoot / (height * width);
        return length;

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        /*
        * This accepts an inputted and tests it.
        */
        try {

            // Create scanner objects for inputs.
            final Scanner myObjOne = new Scanner(System.in);
            final Scanner myObjTwo = new Scanner(System.in);

            // Ask for inputs
            System.out.println("Please enter the height: ");
            final int heightInput = myObjOne.nextInt();
            System.out.println("Please enter the width: ");
            final int widthInput = myObjTwo.nextInt();

            // Calling function and outputting output.
            final int finalLength = lengthCalculator(heightInput, widthInput);
            System.out.println("The wood should be "
                + finalLength + " inch(es) long");

        } catch (java.util.InputMismatchException ex) {
            System.out.println("That was not a valid input ");
        } finally {
            System.out.println("\nDone.");
        }
    }
}
